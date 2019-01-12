package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Exc7_CountryWithMaxLanguages {


    public static void main(String[] args) {

        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session sess = factory.openSession()) {

            Query <Object[]> query = sess.createQuery("SELECT c.Name, cl.Language FROM country AS c JOIN countrylanguage as cl ON c.Code=cl.CountryCode ");

            query.stream().forEach(o -> System.out.println(o[0] + " " + o[1]));

            //TODO
        }
    }


}
