package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import world.model.City;
import world.model.Country;

public class UpdateModifyOneCity {


    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session sess = factory.openSession()) {
            Query<City> q = sess.createQuery("SELECT c FROM City c WHERE name='Bedzin'");
            City modify = q.uniqueResult();
            modify.setName("Bedzin Bedzin");
            Transaction transaction = sess.beginTransaction();
            sess.save(modify);
            transaction.commit();
        }
    }



}
