class Menu {
    String[] Level = { "終了", "Mathematic Toolについて", "中学数学", "高校数学", "その他" };
    String[] Junior = { "戻る", "中学1年", "中学2年", "中学3年" };
    String[] High = { "戻る", "数学Ⅰ", "数学Ａ", "数学Ⅱ", "数学Ｂ", "数学Ⅲ" };
    String[] Other = { "戻る", "コラッツ予想" };

    String[] Juni_1 = { "" };
    String[] Juni_2 = { "" };
    String[] Juni_3 = { "素因数分解" };

    String[] High_1 = { "" };
    String[] High_A = { "ユークリッドの互除法" };
    String[] High_2 = { "" };
    String[] High_B = { "" };
    String[] High_3 = { "" };

    public void Menu(){
        Input nInput = new Input();
        Explain explain = new Explain();
        int n = this.mainMenu();
        switch (n) {
            case 0:
                System.out.println("Finish. Bye!");
                break;
            case 1:
                explain.printEx();
                nInput.inputChoice();
                break;
            case 2:
                System.out.print("\033[H\033[2J");
                System.out.println("［" + Level[n] + "メニュー］");
                this.printJunior();
                break;
            case 3:
                System.out.print("\033[H\033[2J");
                System.out.println("［" + Level[n] + "メニュー］");
                this.printHigh();
                break;
            case 4:
                System.out.print("\033[H\033[2J");
                System.out.println("［" + Level[n] + "メニュー］");
                this.printOther();
                break;
        }
        // System.out.print("Your choice is ");
        // explain.printText(num);
    
    }

    public int mainMenu() {
        Input nInput = new Input();
        System.out.println("［メインメニュー］");
        this.printLevel();
        int num = nInput.inputNum();

        return num;
    }

    public void printLevel() {
        for(int l =0; l < Level.length; l++){
            System.out.println(l+":"+Level[l]);
        }
    }

    public void printJunior() {
        for (int l = 0; l < Junior.length; l++) {
            System.out.println(l + ":" + Junior[l]);
        }
    }

    public void printHigh() {
        for (int l = 0; l < High.length; l++) {
            System.out.println(l + ":" + High[l]);
        }
    }

    public void printOther() {
        for (int l = 0; l < Other.length; l++) {
            System.out.println(l + ":" + Other[l]);
        }
    }
    
    public void printBorder() {
        System.out.println("-----------------------------------");
    }
}
