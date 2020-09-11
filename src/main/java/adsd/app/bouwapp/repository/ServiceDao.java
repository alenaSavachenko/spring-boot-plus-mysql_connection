package adsd.app.bouwapp.repository;

import adsd.app.bouwapp.model.Grondstof;
import adsd.app.bouwapp.model.Test;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

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
    public List<Grondstof> findAllGrondstoffen() {

        Session currentSession=entityManager.unwrap(Session.class);

        Query<Grondstof> query=currentSession.createQuery("from Grondstof", Grondstof.class);

        List<Grondstof> lijst=query.getResultList();

        return lijst;
    }


    public boolean findUser(int id)
    {
        Session session=entityManager.unwrap(Session.class);
        String hql = "FROM Test E WHERE E.id = :user_id";
        Query query = session.createQuery(hql);
        query.setParameter("user_id",id);
        List results = query.list();
        if (results.size()==0)
            return false;
        else {return true;}

    }



}
