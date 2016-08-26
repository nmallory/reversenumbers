import java.util.Scanner;

class ReverseNumbers
{
   public static void main(String args[])
   {
      int number = 0;
      int reverseNo = 0;
      
      System.out.println("Input a number and press enter: ");
      
      //This statement captures the user input
      
      Scanner in = new Scanner(System.in);
      
      //Captured input would be stored in number num
      
      number = in.nextInt();
      
      //While Loop to find the reverse of number entered by user
      
      while( number != 0 )
      {
          reverseNo = reverseNo * 10;
          reverseNo = reverseNo + number %10;
          number = number/10;
      }
      
      //This statement will print out the reverse of the number 
      
      System.out.println("The reverse of input number is: "+reverseNo);
   }
}