import java.util.Scanner;

public class Main {

    public void even(int x, int y){
        int i;
        for (i = x; i < (y); i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
	// printing even numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Print out all even numbers between 2 values");
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        Main m = new Main();
        m.even(num1, num2);
    }
}
