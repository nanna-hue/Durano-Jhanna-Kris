import java.util.Scanner;

public class Routes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String defaultRoute = "\nRecommended Routes: \n> Cebu City - South Bus (Start)\n> Minglanilla (Route 1)\n> San Fernando (Route 2)\n> Carcar (Route 3)\n> Barili (Route 4.1)\n> Dumanjug (Route 4.1.1)\n> Alcantara (Route 4.1.2)\n> Moalboal (End)";
        String recommendedRoute = "\nRecommended Routes: \n> Cebu City - South Bus (Start)\n> Minglanilla (Route 1)\n> San Fernando (Route 2)\n> Carcar (Route 3)\n> Sibonga (Route 4.2)\n> Dumanjug (Route 4.2.1)\n> Alcantara (Route 4.2.2)\n> Moalboal (End)";
        String anotherRoute = "\nRecommended Routes: \n> Cebu City - SouthBus (Start)\n> Minglanilla (Route 1)\n> San Fernando (Route 2)\n> Carcar (Route 3)\n> Sibonga (Route 4.2)\n> Argao (Route 5)\n> Ronda (Route 5.1)\n> Alcantara (Route 5.2)\n> Moalboal (End)";

        double dis1 = 84.9;
        double dis2 = 93.9;
        double dis3 = 92.2;
        double eta = 0;

        System.out.println("Welcome to Routerism Application!");
        System.out.println("\nDefault Routes: \n> Cebu City - South Bus (Start)\n> Minglanilla (Route 1)\n> San Fernando (Route 2)\n> Carcar (Route 3)\n> Barili (Route 4.1)\n> Dumanjug (Route 4.1.1)\n> Alcantara (Route 4.1.2)\n> Moalboal (End)");
        System.out.println("\nIs route via Barili (Route 4.1) obstructed?[Yes/No]");

        while (true) {
            System.out.print("Response: ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("Yes")) {
                System.out.println(recommendedRoute);
                System.out.println("\nIs route via Dumanjug (Route 4.1.1) also obstructed?[Yes/No]");

                while (true) {
                    System.out.print("Response: ");
                    String res = sc.nextLine();

                    if (res.equalsIgnoreCase("Yes")) {
                        System.out.println("How fast are you going?(km/hr)");
                        System.out.print("Response: ");
                        int speed;
                        
                        while (true){
                           if (sc.hasNextInt()){
                              speed = sc.nextInt();
                              break;
                           } else {
                              System.out.println("Invalid! Please enter a number.");
                              System.out.print("Response: ");
                              sc.next();
                           }
                        }  
                        
                        eta = dis3 / speed;
                        int hrs = (int) eta;
                        int mins = (int) ((eta - hrs) * 60);

                        System.out.println(anotherRoute);
                        System.out.println("\nAdditional Data: \n> Speed: " + speed + "\n> Distance: " + dis2 + " km");
                        System.out.println("> ETA: " + hrs + " hrs and " + mins + " mins");
                        break;
                        
                    } else if (res.equalsIgnoreCase("No")) {
                        System.out.println("How fast are you going?(km/hr)");
                        System.out.print("Response: ");
                        int speed;
                        
                        while (true){
                           if (sc.hasNextInt()){
                              speed = sc.nextInt();
                              break;
                           } else {
                              System.out.println("Invalid! Please enter a number.");
                              System.out.print("Response: ");
                              sc.next();
                           }
                        }  
                        
                        eta = dis2 / speed;
                        int hrs = (int) eta;
                        int mins = (int) ((eta - hrs) * 60);

                        System.out.println(recommendedRoute);
                        System.out.println("\nAdditional Data: \n> Speed: " + speed + "\n> Distance: " + dis3 + " km");
                        System.out.println("> ETA: " + hrs + " hrs and " + mins + " mins");
                        break;
                        
                    } else {
                        System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
                    }
                }
                
                break;
                
            } else if (choice.equalsIgnoreCase("No")) {
                System.out.println("How fast are you going?(km/hr)");
                System.out.print("Response: ");
                int speed;
                
                  while (true){
                     if (sc.hasNextInt()){
                        speed = sc.nextInt();
                        break;
                     } else {
                        System.out.println("Invalid! Please enter a number.");
                        System.out.print("Response: ");
                        sc.next();
                     }
                  }   
                     
                eta = dis1 / speed;
                int hrs = (int) eta;
                int mins = (int) ((eta - hrs) * 60);

                System.out.println(defaultRoute);
                System.out.println("\nAdditional Data: \n> Speed: " + speed + "\n> Distance: " + dis1 + " km");
                System.out.println("> ETA: " + hrs + " hrs and " + mins + " mins");
                break;
                
            } else {
                System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
            }
        }
    }
}
