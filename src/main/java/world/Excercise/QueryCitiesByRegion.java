package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import world.model.City;
import world.model.Country;

public class QueryCitiesByRegion {



    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session sess = factory.openSession()) {
            Query<City> q = sess.createQuery("SELECT c FROM City c WHERE District='Zuid-Holland'");
            q.stream().forEach(
                    city -> System.out.println(city.getName() + " " + city.getId() + " " + city.getDistrict() + " " + city.getCountry().getName()));
        }
    }
}
