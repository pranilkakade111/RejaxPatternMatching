import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class Validate
{
	    public static boolean isValidE123(String s) 
	    { 
	        Pattern p = Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$"); 
	 
	        Matcher m = p.matcher(s); 
	        return (m.find() && m.group().equals(s)); 
	    } 
	 
	       
   public static void main( String[] args ) 
   {
      System.out.println(firstName("Pranil"));
      System.out.println(lastName("kakade"));
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Email: ");
      String phone = sc.next();
      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
      boolean result = phone.matches(regex);
      if(result) 
      {
         System.out.println("Given email-id is valid");
      } else 
      {
         System.out.println("Given email-id is not valid");
      }
      
      String phone1 = "+91 3423 546443"; 
      String phone2 = "+44 343 2324";
      String phone3 = "91 4354 3454";
      String[] phoneNumbers= {phone1,phone2,phone3};

      for (int i = 0; i < phoneNumbers.length; i++) {
          String phoneNumber=phoneNumbers[i];
          if (isValidE123(phoneNumber)) 
              System.out.print(phoneNumber+" is valid phone number"); 
          else
              System.out.print(phoneNumber+" is invalid Phone number"); 

          System.out.println();
      }
   }
   
   public static boolean firstName( String firstName ) 
   {
      return firstName.matches( "[A-Z][a-z]*" );
      
   }
   public static boolean lastName( String lastName ) 
   {
	      return lastName.matches( "[A-Z]+([ '-][a-zA-Z]+)*" );
   }
}