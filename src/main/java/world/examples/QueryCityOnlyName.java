package world.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import world.model.City;

public class QueryCityOnlyName {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session sess = factory.openSession()) {
            Query<String> q = sess.createQuery("SELECT c.name FROM City c");
            q.setMaxResults(10);
            q.stream().forEach(System.out::println);
        }
    }
}
