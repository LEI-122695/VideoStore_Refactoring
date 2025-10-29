package v0;

import v3.Customer;
import v3.Movie;
import v3.Rental;

/***********************************************************
 * Filename: Main.java
 * @author fba 6 de Mai de 2013
 ***********************************************************/
public abstract class Main
{

    /***********************************************************
     * @param args
     ***********************************************************/
    public static void main(String[] args)
    {
        v3.Customer who = new Customer("Barack Obama");
        v3.Movie m1 = new v3.Movie("Life of Amalia", v3.Movie.Code.REGULAR);
        v3.Movie m2 = new v3.Movie("Peter Pan", v3.Movie.Code.CHILDRENS);
        v3.Movie m3 = new v3.Movie("Donna del Lago", Movie.Code.NEW_RELEASE);

        who.addRental(new v3.Rental(m1, 1));
        who.addRental(new v3.Rental(m2, 2));
        who.addRental(new Rental(m3, 3));

        System.out.println(who.statement());
    }

}
