import java.util.Scanner;
public class Quadratic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        int d = b*b - 4*a*c; 
        if(d>0){
            double root1 = (-b + Math.sqrt(d)) / (2*a);
            double root2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("Roots are real and different");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if(d==0){
            double root = -b / (2*a);
            System.out.println("Roots are real and same");
            System.out.println("Root: " + root);
        } else {
            System.out.println("Roots are complex and different");   
        }   
    }
    
}
