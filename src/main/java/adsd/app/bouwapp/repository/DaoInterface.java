package adsd.app.bouwapp.repository;

import adsd.app.bouwapp.model.Grondstof;
import adsd.app.bouwapp.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface DaoInterface  {

    List<Grondstof> findAllGrondstoffen ();

}
