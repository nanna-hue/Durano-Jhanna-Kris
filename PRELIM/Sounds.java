import java.util.Scanner;
public class sounds 
{
   public static void main (String args[])
   {  
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Activity One: What does the animal say?");
      System.out.println("Select an animal: ");
      System.out.print("1. Dog \n2. Cat\n3. Goat \n4. Snake \nEnter a number: ");
      int response = sc.nextInt();
      
      switch (response)
      {
         case 1:      
         Dog ero = new Dog();
         ero.displayName();
         break;
         
         case 2: 
         Cat ereng = new Cat();
         ereng.displayName();
         break;
         
         case 3: 
         Goat kand = new Goat();
         kand.displayName();
         break;
         
         case 4: 
         Snake bten = new Snake();
         bten.displayName();
         break;
         
         default:
         System.out.println("Invalid Input");
         break;
       } 

   }
}
   
   class Dog {
      public void displayName () {
         System.out.println("Animal: Dog \nSound: Arf Arf");
      }
   }
   
   class Cat extends Dog {
      public void displayName () {
         System.out.println("Animal: Cat \nSound: Meow Meow");
      }
   }

   class Goat extends Dog {
      public void displayName () {
         System.out.println("Animal: Goat \nSound: Meh Meh");
      }
   }

   class Snake extends Dog {
      public void displayName () {
         System.out.println("Animal: Snake \nSound: Sss Sss");
      }
   }

