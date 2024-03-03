package Project2;
import java.util.*;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultpasswordLength;
    private String alternateEmail;
    private String companySuffix = "company.com";

    //constructor to receive the first name and the last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created" + this.firstName + this.lastName);

        // call the method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department is "+ this.department);


        // call a method that returns a random password
        this.password = randomPassword(defaultpasswordLength);
        System.out.println("Your password is: "+ this.password);

        //combine emails to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        System.out.println("Your email is: "+ email);
    }

    // ask for the department 
    private String setDepartment(){
        System.out.println("Department Codes - \n for Sales\n for Development\n for Accounting\n for None");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1){
            return "Sales";
        } else if (depChoice == 2){
            return "Dev";
        } else if (depChoice == 3){
            return "Accounting";
        }else{
            return "Nothing";
        }
    }

    //generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[] password = new char[length];
        for (int i=0;i<length;i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            System.out.println(rand);
            System.out.println(passwordSet.charAt(rand));
        }
        return new String (password);
    }

    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }


    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }


    //change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Display Name: "+ firstName + " "+ lastName+
                "Company Email" + email + 
                " MailBox Capacity" + mailboxCapacity;
    }
}
