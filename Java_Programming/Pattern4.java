import java.util.Scanner;
public class Pattern4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
