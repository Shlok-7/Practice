
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class internalizations {
    public static void main(String[] args) {
        double amt=1234.56;

        //Locale - An object representing a specific gerographical or cultural region
        Locale us=Locale.US;
        Locale india=new Locale("en","In");
        Locale france= Locale.FRANCE;

        // NumberForamt(currency+number)-A tool use to format numbers and Decimal as an regional rules
        NumberFormat uscurrency=NumberFormat.getCurrencyInstance(us);
        NumberFormat incurrency=NumberFormat.getCurrencyInstance(india);
        NumberFormat francecurrency=NumberFormat.getCurrencyInstance(france);

        // currency-an object representing physical money
        System.out.println("US Currency"+uscurrency.format(amt));
        System.out.println("INDIA Currency"+incurrency.format(amt));
        System.out.println("FRANCE Currency"+francecurrency.format(amt));

        // ResourceBundle
        ResourceBundle rbus=ResourceBundle.getBundle("message"+us);
        ResourceBundle rbfr=ResourceBundle.getBundle("message"+france);

        System.out.println("Us greeting:"+rbus.getString("greeting"));
        System.out.println("france greeting"+rbfr.getString("greeting"));



    }
    
}
