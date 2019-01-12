package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Exc5_FindLanguageCountryFullName {


    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session sess = factory.openSession()) {
           Query <String> query = sess.createQuery(
                    "SELECT c.name FROM CountryLanguage cl JOIN Country c ON cl.id.countryCode=c.code " +
                            "WHERE cl.id.language='French'");
           query.stream().forEach(name -> System.out.println(name));
        }
    }
}
