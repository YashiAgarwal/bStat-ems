package bStat.ems.com.common.dao;

import bStat.ems.com.common.models.tables.Work;
import bStat.ems.com.common.models.tables.Workers;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class WorkDao extends AbstractDAO<Work> {

    private static final Logger logger = LoggerFactory.getLogger(WorkDao.class);

    @Inject
    public WorkDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public Work saveInDB(Work Work) {
        return persist(Work);
    }

}
