class Explain extends Menu{
    public void printName(){
        System.out.println("---------------\n"+
                           "Mathematic Tool\n"+
                           "---------------");
    }

    public void printEx() {
        System.out.println("大学非公認サークル「Mathematics」のために作りました。");
    }

    public void printText(int m) {
        switch (m) {
            case 1:
                System.out.println("Prime Factorization.");
                printBorder();
                System.out.println("Let's do Prime Factorization!");
                break;
            case 2:
                System.out.println("Euclid's Algorithm.");
                printBorder();
                break;
            case 3:
                System.out.println("Collatz Conjecture.");
                printBorder();
                break;
        }
    }
}
