package bStat.ems.com.common.dao;

import bStat.ems.com.common.models.tables.Deposits;
import bStat.ems.com.common.models.tables.Wages;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class DepositsDao extends AbstractDAO<Deposits> {

    private static final Logger logger = LoggerFactory.getLogger(DepositsDao.class);

    @Inject
    public DepositsDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public Deposits saveInDB(Deposits Deposits) {
        return persist(Deposits);
    }

}
