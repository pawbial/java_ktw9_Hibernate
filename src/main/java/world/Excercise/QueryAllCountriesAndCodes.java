package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import world.model.City;

public class QueryAllCountriesAndCodes {


    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session sess = factory.openSession()) {
            Query<City> q = sess.createQuery("SELECT c FROM Country c");
            q.stream().forEach(
                    country -> System.out.println(country.getName() + " " + country.getId()));
        }
    }

}
