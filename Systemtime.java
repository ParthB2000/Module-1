import java.util.Calendar;
import java.util.Date;

//Write a Java program to display the system time.

public class Systemtime {
		  
		  public static void main(String[] args)
		  {
		          Date data = Calendar.getInstance().getTime(); 
		          
		          System.out.println(data);
		  }
		}



