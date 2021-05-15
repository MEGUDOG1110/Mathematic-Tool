class Explain extends Menu{
    public void printName(){
        super.printBorder();
        System.out.println("          Mathematic Tool");
        super.printBorder();
    }

    public void printEx() {
        super.printlBorder();
        System.out.println("Mathematics Toolは大学非公認サークル「Mathematics」のために作りました。");
        super.printlBorder();
    }

    public void exFact() {
        super.printlBorder();
        System.out.println("自然数(正の整数)を素数の積で表すことを「素因数分解」という。\n"+
                           "素数は1と自分以外の数では割り切れない数のことである。例：2, 3, 5, 7, 9, 11 ...");
        super.printlBorder();
    }

    public void exEuclid() {
        super.printlBorder();
        System.out.println("ユークリッドの互除法は、2 つの自然数の最大公約数を求める手法の一つである。\n"+
                           "2 つの自然数 a, b について、a の b による剰余を r とすると、\n"+
                           " a と b との最大公約数は b と r との最大公約数に等しいという性質が成り立つ。");
        super.printlBorder();
    }

    public void exCollatz() {
        super.printlBorder();
        System.out.println("コラッツ問題は、「任意の正の整数 n をとり、\n"+
                           " n が偶数の場合、n を 2 で割る\n"+
                           " n が奇数の場合、n に 3 をかけて 1 を足す\n"+
                           "という操作を繰り返すと、どうなるか」というものである。\n"+
                           "「どんな初期値から始めても、有限回の操作のうちに必ず 1 に到達する\n"+
                           "（そして 1 → 4 → 2 → 1 というループに入る）」という主張が、コラッツ予想である。");
        super.printlBorder();
    }
}
