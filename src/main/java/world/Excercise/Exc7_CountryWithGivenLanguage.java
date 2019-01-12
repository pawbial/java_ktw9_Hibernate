package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import world.model.Country;

import javax.management.Query;

public class Exc7_CountryWithGivenLanguage {


    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session session = factory.openSession()) {

            Query <Country> q = session.createQuery(
                    "SELECT * FROM CountryLanguage cl WHERE "
            )
        }
    }
}
