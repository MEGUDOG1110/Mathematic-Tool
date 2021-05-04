class Menu {
    String[] Level = {"終了", "中学数学", "高校数学", "その他"};
    String[] Junior = {"戻る", "中学1年", "中学2年", "中学3年"};
    String[] High = {"戻る", "数学Ⅰ", "数学Ａ", "数学Ⅱ", "数学Ｂ", "数学Ⅲ"};
    String[] Other = {"戻る", "コラッツ予想"};

    void Menu(){
    Input nInput = new Input();
    Explain explain = new Explain();
    
    System.out.println("［メニュー］");
    this.printLevel();
    int num = nInput.inputNum();

    switch (num) {
        case 0:
            System.out.println("Finish. Bye!");
            break;
        case 1:
            this.printJunior();
            break;
        case 2:
            this.printHigh();
            break;
        case 3:
            this.printOther();
            break;
    }
    
    // System.out.print("Your choice is ");
    // explain.printText(num);
    
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
