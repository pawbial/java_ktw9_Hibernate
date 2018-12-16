package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class QuerryCountryWithLessCities {

//    public static void main(String[] args) {
//        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
//            Session sess = factory.openSession()) {
//            Query<Object[]> q = sess.createQuery("SELECT c.name, size(c.cities) " +
//                    " FROM Country c GROUP BY c");
//            q.stream().filter(o -> o[1]<2).forEach(
//                    o -> System.out.println(o[0] + " " + o[1]));
//        }
//    }
}
