
package hexclock;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;
public class HexClock {
    public String Hexcode = null;
    public static String formattedDate = null;
    public static String hex = null; 
    public static Color col;
    public static Scanner input = new Scanner(System.in);

    
    public static void main(String[] args) {
        getCurrentTime();
        NewJPanel main = new NewJPanel();
        main.setSize(1000,1000);
        main.setVisible(true);
        boolean flag = true;
        while(flag == true){
            getCurrentTime();
            main.ChageText();
            main.setBackground(col);
            randCol();
            System.out.println("Would you like to run again?");
            String ask = input.next();
            if (ask.equalsIgnoreCase("no")) {
                flag = false;
            }
        }
            
        
    
            
    }
    public static  void getCurrentTime() {
    Date date = new Date();
    String strDateFormat = "hh:mm:ss a";
    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
    formattedDate= dateFormat.format(date);
    System.out.println(formattedDate);
//    System.out.println(formattedDate.substring(0, 2));
//    System.out.println(formattedDate.substring(3, 5));
//    System.out.println(formattedDate.substring(6, 8));
}
    public static void randCol(){
        Random Rand = new Random();
        int Temp = Integer.parseInt(formattedDate.substring(0, 2));
        int r = Temp;
        Temp = Integer.parseInt(formattedDate.substring(3, 5));
        int g =Temp;
        Temp = Integer.parseInt(formattedDate.substring(6, 8));
        int b =Temp;
        hex = String.format("#%02X%02X%02X", r, g, b);
        System.out.println("The Hex value is: "+hex);
        if (hex.equalsIgnoreCase("#9932CC")) {
            col =Color.YELLOW;
        }
        if (hex.equalsIgnoreCase("#8B008B")) {
            col =Color.BLUE;
        }
        if (hex.equalsIgnoreCase("#800080")) {
            col =Color.RED;
        }
        if (hex.equalsIgnoreCase("#4B0082")) {
            col =Color.ORANGE;
        }
        if (hex.equalsIgnoreCase("#FF0000")) {
            col =Color.WHITE;
        }
        //will add more colours
        else{
            col = Color.CYAN;
        }
    }
}
