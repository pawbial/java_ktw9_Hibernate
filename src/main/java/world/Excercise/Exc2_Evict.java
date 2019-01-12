package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import world.model.City;

public class Exc2_Evict {

    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session sess = factory.openSession()) {
            City city = sess.load(City.class,1);
            city.setDistrict("123");
            sess.evict(city); //usuwa śledzenie obiektu, obiekt jest detached
            Transaction tx = sess.beginTransaction();
            sess.save(city);
            tx.commit();

        }
    }
}
