package bStat.ems.com.bootstrap;


import bStat.ems.com.common.models.tables.*;
import bStat.ems.com.common.utils.GuiceInjector;
import bStat.ems.com.config.EMSConfiguration;
import bStat.ems.com.resources.DataResource;
import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Validator;


/**
 * Created by prashant170392 on 01/05/2017
 */
public class EMSApplication extends Application<EMSConfiguration> {

    private static final Logger logger = LoggerFactory.getLogger(EMSApplication.class);

    public static void main(String[] args) throws Exception {
        new EMSApplication().run(args);
    }

    private final HibernateBundle<EMSConfiguration> hibernate = new HibernateBundle<EMSConfiguration>(Deposits.class,
            Formulas.class, SalaryStructures.class, TaxDeductions.class, WageRates.class, Wages.class,
            Work.class, Workers.class) {
        @Override
        public DataSourceFactory getDataSourceFactory(EMSConfiguration emsConfiguration) {
            logger.info("Configuring database ...");
            return emsConfiguration.getDatabase();
        }
    };


    @Override
    public void initialize(Bootstrap<EMSConfiguration> bootstrap) {
        bootstrap.addBundle(hibernate);

        bootstrap.addBundle(new SwaggerBundle<EMSConfiguration>() {
            @Override
            public SwaggerBundleConfiguration getSwaggerBundleConfiguration(EMSConfiguration configuration) {
                return configuration.getSwagger();
            }
        });
    }

    @Override
    public void run(EMSConfiguration config, Environment environment) throws Exception {
        logger.info("Starting Up the bStat EMS Application ... ");
        Validator validator = environment.getValidator();

        // ---------- register metriems ---------
        MetricRegistry metricRegistry = environment.metrics();
        MetricsService.setRegistry(metricRegistry);
        JmxReporter.forRegistry(environment.metrics()).build().start();

        Injector injector = Guice.createInjector(new EMSModule(hibernate, config, validator, metricRegistry));
        GuiceInjector.assignInjector(injector);

        //------- registering app resources -----------
        environment.jersey().register(injector.getInstance(DataResource.class));

        environment.lifecycle().manage(injector.getInstance(EMSManagedService.class));
    }
}