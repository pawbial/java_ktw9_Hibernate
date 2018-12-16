package world.Excercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import world.model.City;
import world.model.Country;

public class UpdateAddCity {


    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session sess = factory.openSession()) {
            City newCity = new City();
            newCity.setName("Bedzin");
            newCity.setDistrict("Slaskie");
            Country poland = sess.load(Country.class,"POL");
            newCity.setCountry(poland);
            poland.getCities().add(newCity);
            Transaction transaction = sess.beginTransaction();
            sess.save(newCity);
            transaction.commit();
            //Działa sprawdzone
        }
    }

}


