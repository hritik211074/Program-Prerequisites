
import java.util.*;
public class Calculate_Simple_Interest{
    public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
	   double principal=sc.nextDouble();
	   double rate=sc.nextDouble();
	   double time=sc.nextDouble();
	   
	   double interest=(principal*rate*time)/100;
	   System.out.println("Simple interest for particular amount in particular year in fixed time is ->>"+(interest));
	}
 }