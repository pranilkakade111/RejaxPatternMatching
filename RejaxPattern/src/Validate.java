public class ValidateFirstName
{
   public static void main( String[] args ) 
   {
      System.out.println(firstName("Pranil"));
      System.out.println(lastName("kakade"));
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