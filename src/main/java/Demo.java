
import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {

    	int year;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter any Year:");
            year = scan.nextInt();
        }
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                isLeap = year % 400 == 0;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}


