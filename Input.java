import java.util.Scanner;

class Input {
    Scanner scanner = new Scanner(System.in);

    public int inputNum(){                      //メニュー選択
        System.out.print("Menu Number : ");
        int num = scanner.nextInt();
        return num;
    }
    
    public int inputOne(){                      //数字を1つだけ入力
        System.out.print("Input Number : ");
        int num = scanner.nextInt();
        return num;
    }

    public int[] inputTwo(){                    //数字を2つ入力
        System.out.print("Input Number(A) : ");
        int num1 = scanner.nextInt();
        System.out.print("Input Number(B) : ");
        int num2 = scanner.nextInt();
        int [] nums = {num1, num2};
        return nums;
    }
}
