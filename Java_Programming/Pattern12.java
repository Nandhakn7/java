import java.util.Scanner;
public class Pattern12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            for(k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(k=1;k<=(n-1)-i+1;k++){
                System.out.print(" ");
            }
            for(k=1;k<=(n-1)-i+1;k++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
