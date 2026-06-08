
import java.text.NumberFormat;
import java.util.Locale;

public class compactnumbertest {
    public static void main(String[] args) {
        long viewcount=2500000; 

        //short format 2M
        NumberFormat shortformat=NumberFormat.getCompactNumberInstance(Locale.US,NumberFormat.Style.SHORT);

        // adds 1 decimal so 2.5 not rounds to 3 M
        shortformat.setMaximumFractionDigits(1);
        String shortresult=shortformat.format(viewcount);
        System.out.println("Short format "+ shortresult);   // 2.5M

        // long fromat 2500000
        NumberFormat longformat=NumberFormat.getCompactNumberInstance(Locale.US ,NumberFormat.Style.LONG);
        longformat.setMaximumFractionDigits(1);
        String longresult=longformat.format(viewcount);
        System.out.println("Long format "+ longresult);  // 2 Million


        //indian locale demo
        NumberFormat indian=NumberFormat.getCompactNumberInstance(new Locale("en","IN"),NumberFormat.Style.SHORT);
        indian.setMaximumFractionDigits(1);
        System.out.println("Indian format "+indian.format(viewcount));          // 25L= 25 Lakhs

    }
    
}
