package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import world.model.City;
import world.model.Country;

public class Exc1_SeimpleRegionUpdate {

    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session sess = factory.openSession()) {
            City city = sess.load(City.class,1);
            Transaction tx = sess.beginTransaction();
            city.setDistrict("ABC");
            tx.commit();
        }
    }
}
