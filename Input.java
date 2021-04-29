import java.util.Scanner;

class Input {
    Scanner scanner = new Scanner(System.in);

    public int inputNum(){
        System.out.print("Menu Number : ");
        int num = scanner.nextInt();
        return num;
    }
    
    public int inputOne(){
        System.out.print("Input Number : ");
        int num = scanner.nextInt();
        return num;
    }

    public int[] inputTwo(){
        System.out.print("Input Number(A) : ");
        int num1 = scanner.nextInt();
        System.out.print("Input Number(B) : ");
        int num2 = scanner.nextInt();
        int [] nums = {num1, num2};
        return nums;
    }
}
