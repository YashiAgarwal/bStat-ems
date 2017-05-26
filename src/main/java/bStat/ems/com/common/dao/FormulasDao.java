package bStat.ems.com.common.dao;

import bStat.ems.com.common.models.tables.Formulas;
import bStat.ems.com.common.models.tables.Wages;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class FormulasDao extends AbstractDAO<Formulas> {

    private static final Logger logger = LoggerFactory.getLogger(FormulasDao.class);

    @Inject
    public FormulasDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public Formulas saveInDB(Formulas Formulas) {
        return persist(Formulas);
    }

}
