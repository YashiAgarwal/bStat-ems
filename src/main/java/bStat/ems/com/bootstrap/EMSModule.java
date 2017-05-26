package bStat.ems.com.bootstrap;

import bStat.ems.com.config.EMSConfiguration;
import com.codahale.metrics.MetricRegistry;
import com.google.inject.AbstractModule;
import io.dropwizard.hibernate.HibernateBundle;
import org.hibernate.SessionFactory;

import javax.validation.Validator;
import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeFunction.bind;

/**
 * Created by prashant170392 on 01/05/2017
 */
public class EMSModule extends AbstractModule {

    private HibernateBundle<EMSConfiguration> bundle;
    private EMSConfiguration config;
    private Validator validator;
    private List<String> buckets;
    private final MetricRegistry metricRegistry;

    public EMSModule(HibernateBundle<EMSConfiguration> bundle, EMSConfiguration config, Validator validator,
                     final MetricRegistry metricRegistry) {
        this.bundle = bundle;
        this.config = config;
        this.validator = validator;
        this.metricRegistry = metricRegistry;
    }

    @Override
    protected void configure() {
        bind(HibernateBundle.class).toInstance(bundle);
        bind(EMSConfiguration.class).toInstance(config);
        bind(Validator.class).toInstance(validator);
        bind(SessionFactory.class).toInstance(bundle.getSessionFactory());
        buckets = new ArrayList<String>();
        buckets.add(this.config.getConfigParams().getBucket());
    }

}
