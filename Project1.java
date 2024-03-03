import java.util.*;

public class Project1{
    
    public static void main(String args[]){
        System.out.println("Hello Welcome to the food app.");

        System.out.println("Please create a password: ");

        Scanner sc = new Scanner(System.in);
        String pass1 = sc.next();
        System.out.println("Hey! your password is "+ pass1);

        System.out.println("Please enter your password");
        String pass2 = sc.next();

        while (!pass2.equals(pass1)){
            System.out.println("This is not the right password. Please try again!");
            pass2 = sc.next();
        }

        System.out.println("Access Granted");
        System.out.println("Are you hungry?");
        String ans1 = sc.next();

        if(ans1.equals("yes")){
            System.out.println("Choose what you want to eat between pizza, burger or fish?");
            String ans2 = sc.next();

            while(!ans2.equals("pizza")&&!ans2.equals("burger")&&!ans2.equals("fish")){
                System.out.println("Sorry, we do not have this. What would you like to have between pizza, burger and fish.");
                ans2 = sc.next();
            }

            if(ans2.equals("pizza")||ans2.equals("burger")||ans2.equals("fish")){
                System.out.println("Do you want something to drink?");
                String ans3 = sc.next();

                while(!ans3.equals("yes")&&!ans3.equals("no")){
                    System.out.println("Wrong command please try again: ");
                    ans3 = sc.next();
                }
                if(ans3.equals("yes")){
                    System.out.println("Ok, your drink is ready to serve.");
                }else{
                    System.out.println("No problem! Enjoy your meal.");
                }
            }
        }else{
            System.out.println("Alright! Have a good Day.");
        }
    }
}