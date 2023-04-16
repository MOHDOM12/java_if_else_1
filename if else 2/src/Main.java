import  java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
        System.out.println(" Enter first numbers");
       double variables1 = s.nextDouble();
        System.out.println(" Enter second numbers");
       double variables2 = s.nextDouble();
        System.out.println(" Enter third numbers");
       double variables3 = s.nextDouble();
       if(variables1 > variables2 &&  variables1 > variables3)
       {
           System.out.println(" variables 1 is bigger");
       }
       else if(variables2 > variables1 && variables2 >variables3)
       {
           System.out.println(" variables 2 is bigger");
       }
       else if(variables3 > variables1 && variables3 > variables2)
       {
           System.out.println(" variables 3 is bigger");
       }
       else
       {
           System.out.println("they are equal ");
       }
    }
}