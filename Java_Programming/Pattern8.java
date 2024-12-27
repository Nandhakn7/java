import java.util.Scanner;

public class Pattern8 {
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=5-i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-(i+1)+1)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
