class Menu extends Main{
    String[] Level = { "終了", "Mathematic Toolについて", "中学数学", "高校数学", "その他" };
    String[] Junior = { "戻る","素因数分解（３年）", "AQAK" };
    String[] High = { "戻る", "ユークリッドの互除法（数学Ａ）" };
    String[] Other = { "戻る", "コラッツ予想" };
    
    public void Menu(){
        Input nInput = new Input();
        Explain explain = new Explain();
        Function nFunction = new Function();
        
        int n1 = this.mainMenu();
        switch (n1) {
            case 0:
                System.out.println("Finish. Bye!");
                break;
            case 1:
                explain.printEx();
                nInput.inputContinue();
                break;
            case 2: //中学数学
                nFunction.function("J", process(n1, Junior));
                break;
            case 3: //高校数学
                nFunction.function("H", process(n1, High));
                break;
            case 4: //その他
                nFunction.function("O", process(n1, Other));
                break;
        }
    }

    public int mainMenu() {
        System.out.println("［メインメニュー］");
        this.printLevel();
        Input nInput = new Input();
        int num = nInput.inputNum();
        return num;
    }

    public int process(int n, String[] s){
        System.out.print("\033[H\033[2J");
        System.out.println("［" + Level[n] + "メニュー］");
        printContent(s);
        return subMenu(s);
    }

    public int subMenu(String[] s){
        Input nInput = new Input();
        int n2 = nInput.inputNum();
        System.out.print("\033[H\033[2J");
        switch(n2){
            case 0:
                Menu();
                break;
            default:
                System.out.println(s[n2]);
                break;
        }
        return n2;
    }

    public void printLevel() {
        for(int l =0; l < Level.length; l++){
            System.out.println(l+":"+Level[l]);
        }
    }

    public void printContent(String[] c) {
        for (int l = 0; l < c.length; l++) {
            System.out.println(l + ":" + c[l]);
        }
    }
    
    public void printBorder() {
        System.out.println("-----------------------------------");
    }

    public void Main() {
        Explain explain = new Explain();
        explain.printName();
        Menu();
    }

}
