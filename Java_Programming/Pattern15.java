import java.util.*;
public class Pattern15 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print(" ");
                if(i==0||j==0||i==num-1||j==num-1||i==j||i+j==num-1||i==5||j==5||i==num-1||j==num-1||i+j==num/2||i-j==num/2||j-i==num/2||i+j==(num-1)+num/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
