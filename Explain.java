class Explain extends Menu{
    public void printName(){
        super.printBorder();
        System.out.println("          Mathematic Tool");
        super.printBorder();
    }

    public void printEx() {
        System.out.println("大学非公認サークル「Mathematics」のために作りました。");
    }

    public void exFact() {
        System.out.println("自然数(正の整数)を素数の積で表すことを「素因数分解」という。\n"+
                           "素数は1と自分以外の数では割り切れない数のことである。例：2, 3, 5, 7, 9, 11 ...");
    }
}
