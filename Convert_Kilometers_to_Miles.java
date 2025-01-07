
import java.util.*;
public class Convert_Kilometers_to_Miles{
    public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
	   double km_distance=sc.nextDouble();
	   double mile_distance=km_distance*0.621371;
	   System.out.println("Conversion from km to miles is->>"+(mile_distance));
	}
 }