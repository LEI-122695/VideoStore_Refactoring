package v0;

import v6.Customer;
import v6.Movie;
import v6.Rental;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/***********************************************************
 * Filename: Main.java
 * @author fba 6 de Mai de 2013
 ***********************************************************/
public abstract class Main
{

    /***********************************************************
     * @param args
     * @throws IOException
     ***********************************************************/
    public static void main(String[] args) throws IOException
    {
        v6.Customer who = new Customer("Barack Obama");
        v6.Movie m1 = new v6.Movie("Life of Amalia", v6.Movie.Code.REGULAR);
        v6.Movie m2 = new v6.Movie("Peter Pan", v6.Movie.Code.CHILDRENS);
        v6.Movie m3 = new v6.Movie("Donna del Lago", Movie.Code.NEW_RELEASE);

        who.addRental(new v6.Rental(m1, 1));
        who.addRental(new v6.Rental(m2, 2));
        who.addRental(new Rental(m3, 3));
        System.out.println( who.statement());

        PrintWriter html = new PrintWriter(new FileWriter("webPages/statement.html"));
        html.println(who.htmlStatement());
        html.close();
    }

}
