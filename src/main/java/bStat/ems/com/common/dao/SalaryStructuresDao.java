package bStat.ems.com.common.dao;

import bStat.ems.com.common.models.tables.SalaryStructures;
import bStat.ems.com.common.models.tables.Wages;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class SalaryStructuresDao extends AbstractDAO<SalaryStructures> {

    private static final Logger logger = LoggerFactory.getLogger(SalaryStructuresDao.class);

    @Inject
    public SalaryStructuresDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public SalaryStructures saveInDB(SalaryStructures SalaryStructures) {
        return persist(SalaryStructures);
    }

}
