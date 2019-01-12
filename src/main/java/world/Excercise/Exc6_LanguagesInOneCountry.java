package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import world.model.Country;
import world.model.CountryLanguage;

import java.util.List;

public class Exc6_LanguagesInOneCountry {


    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session sess = factory.openSession()) {
            //ładowanie obiektu
//          Country usa = sess.load(Country.class,"POL");
//           usa.getLanguages().forEach(lang -> System.out.println(lang.getId().getLanguage()));


            //to samo co powyżej, przez zapytanie
            Query <Country> q = sess.createQuery("SELECT c FROM Country c WHERE c.code='POL'");
            Country country = q.getSingleResult();
            country.getLanguages().forEach(lang -> System.out.println(lang.getId().getLanguage()));

        }
    }
}
