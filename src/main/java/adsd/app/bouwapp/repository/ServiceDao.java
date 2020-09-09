package adsd.app.bouwapp.repository;

import adsd.app.bouwapp.model.Grondstof;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ServiceDao {

    // autowiring jdbc template , jdbc properties are configured in application properties
    // spring autpmatically detetcts and creates  jdbc template object using configuration

    @Autowired
    JdbcTemplate jdbcTemplate;

    //returns list of materials

    public List<String> getGrondstoffen  ()
    {
        System.out.println("service dao");
        List<String> grondstoffenLijst =new ArrayList<>();

        grondstoffenLijst.addAll( jdbcTemplate.queryForList("select tutorial_title from test", String.class));
        //jdbcTemplate.queryForList("select tutorial_title form test", String.class);
        System.out.println("lijst:"+grondstoffenLijst);
        return grondstoffenLijst;
    }


}
