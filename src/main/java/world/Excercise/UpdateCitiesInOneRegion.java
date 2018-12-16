package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import world.model.City;

import java.util.ArrayList;
import java.util.List;

public class UpdateCitiesInOneRegion {



    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session sess = factory.openSession()) {
            Query <City> q = sess.createQuery("SELECT c FROM City c WHERE district='Slaskie'");
            Transaction transaction = sess.beginTransaction();
            for (City city : q.getResultList()) {
                city.setName(city.getName() + " Silesia");
                sess.save(city);
            }
            transaction.commit();
        }
    }

}
