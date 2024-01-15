// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in you
import  java.util.*;
public class ATM_project {
    public static void main(String[] args){
        int pin =1234;
        int balance = 10000;
        int addAmount =0;
        int takeamount =0;
         String name;
         Scanner scanner =new Scanner(System.in);
         // we have to take an input by
         System.out.println(" Enter the pin number:");
         int password =scanner.nextInt();
          if (password==pin){
              System.out.println(" Enter the you name:");
              name = scanner.next();
              System.out.println(" Welcomw"+ name);
              while(true){
                  System.out.println("Press 1to check your balance:");
                  System.out.println("Press 2 to  add amount:");
                  System.out.println("Press 3 to take amount:");
                  System.out.println("Press 4 to take resipt:");
                  System.out.println("Press 5 to EXIT");

                  int opt= scanner.nextInt();
                  switch (opt){
                      case 1:
                          System.out.println("your current balance id"+ balance);
                          break;
                      case 2:
                          System.out.println(" how mach amount did you want to add to your account");
                          addAmount= scanner.nextInt();
                          System.out.println( "Successfully credited" );
                          balance= addAmount+balance;
                          break;
                      case 3:
                          System.out.println("how much did you want to take ");
                          takeamount= scanner.nextInt();
                          if (takeamount > balance){
                              System.out.println(" you balance is insufficient");
                              System.out.println("try less then your available balance");

                          }
                          else {
                              System.out.println("successfully taken");
                              balance = balance -takeamount;
                          }
                          break;
                      case 4:
                          System.out.println(" welcone to all  in one mini ATM");
                          System.out.println("available  balance is "+ balance);
                          System.out.println("amount deposited"+addAmount);
                          System.out.println("amount taken "+ takeamount);
                          System.out.println("Thank for coming");
                          break;

                  }
                  if (opt == 5){
                      System.out.println(" thank you");
                      break;

                  }
              }
          }else {
              System.out.println("Wrong pin number");
          }

    }

}
