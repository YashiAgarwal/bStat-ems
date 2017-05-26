package bStat.ems.com.common.dao;

import bStat.ems.com.common.models.tables.Workers;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class WorkersDao extends AbstractDAO<Workers> {

    private static final Logger logger = LoggerFactory.getLogger(WorkersDao.class);

    @Inject
    public WorkersDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public Workers saveInDB(Workers Workers) {
        return persist(Workers);
    }
}

