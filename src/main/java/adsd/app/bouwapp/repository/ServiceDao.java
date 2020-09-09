package adsd.app.bouwapp.repository;

import adsd.app.bouwapp.model.Grondstof;
import adsd.app.bouwapp.model.Test;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Repository
public class ServiceDao implements  DaoInterface {


    private EntityManager entityManager;

    @Autowired
    public ServiceDao (EntityManager theEntityManager)
    {
        entityManager=theEntityManager;
    }
    //returns list of materials
    @Override
    @Transactional
    public List<Test> findAllGrondstoffen() {

        Session currentSession=entityManager.unwrap(Session.class);

        Query<Test> query=currentSession.createQuery("from Test", Test.class);

        List<Test> lijst=query.getResultList();

        return lijst;
    }
}
