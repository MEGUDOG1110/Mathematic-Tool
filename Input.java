import java.util.Scanner;

class Input extends Menu{
    Scanner scanner = new Scanner(System.in);

    public int inputNum(){                      //メニュー選択
        System.out.print("Menu Number : ");
        int num = scanner.nextInt();
        return num;
    }
    
    public void inputContinue() {                 // Yes or No 選択
        System.out.print("Continue? (Y/N) : ");
        String str = scanner.next();
        switch (str) {
            case "Y", "y":
                System.out.print("\033[H\033[2J");
                super.Main();;
                break;
            case "N", "n":
                System.out.println("Finish. Bye!");
                break;
            default:
                System.out.println("Input Error!");
                inputContinue();
        }
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
