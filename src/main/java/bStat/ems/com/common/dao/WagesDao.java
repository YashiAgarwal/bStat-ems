package bStat.ems.com.common.dao;

import bStat.ems.com.common.models.tables.Wages;
import bStat.ems.com.common.models.tables.Workers;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class WagesDao extends AbstractDAO<Wages> {

    private static final Logger logger = LoggerFactory.getLogger(WagesDao.class);

    @Inject
    public WagesDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public Wages saveInDB(Wages Wages) {
        return persist(Wages);
    }

}
