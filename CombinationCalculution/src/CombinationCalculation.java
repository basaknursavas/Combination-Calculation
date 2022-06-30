import java.util.Scanner ;
public class CombinationCalculation {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = scan.nextInt();
        int nFactorial = 1 ;

        for (int i = 1 ; i <= n ; i++){
            nFactorial = nFactorial * i ;
        }
        System.out.println(n + "! = " + nFactorial);


        System.out.print("Enter the value of r : ");
        int r = scan.nextInt();
        int rFactorial = 1 ;

        for (int i = 1 ; i <= r ; i++){
            rFactorial = rFactorial * i ;
        }
        System.out.println(r + "! = " + rFactorial);

        int xFactorial = 1 ;
        for (int i = 1 ; i <=n-r ; i++){
            xFactorial = xFactorial * i ;
        }
        System.out.println("(n-r)! = " + xFactorial);


        int combination = (nFactorial) / ((rFactorial) * (xFactorial)) ;

        System.out.println("The formula of the combination : n! / (r! * (n-r)!)");
        System.out.println("The result of combination is : " + combination);




    }
}
