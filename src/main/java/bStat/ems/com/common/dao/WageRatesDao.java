package bStat.ems.com.common.dao;

import bStat.ems.com.common.models.tables.WageRates;
import bStat.ems.com.common.models.tables.Wages;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class WageRatesDao extends AbstractDAO<WageRates> {

    private static final Logger logger = LoggerFactory.getLogger(WageRatesDao.class);

    @Inject
    public WageRatesDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public WageRates saveInDB(WageRates WageRates) {
        return persist(WageRates);
    }

}
