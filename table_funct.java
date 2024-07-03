import java.util.Scanner;

public class table_funct {
    
    public static void tablefunction(int n){
        for(int i=1;i<=10;i++){
            int table=n*i;
            System.out.println(n + " * " +i+" = " +table);
            
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        tablefunction(n);
    }
}
