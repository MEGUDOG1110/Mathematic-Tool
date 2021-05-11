class Fact {
    public void nFact() {
        Input nInput = new Input();
        Explain explain = new Explain();
        explain.exFact();
        int n = nInput.inputOne();
        if(n < 2){
            System.out.println("Input Error! ( n > 2 )");
            nFact();
        }else{
            System.out.print(n + " =");
            while (n % 2 == 0){
                if(n -2 == 0){
                    System.out.println(" 2");
                    break;
                }else{
                    System.out.print(" 2 *");
                    n /= 2;
                }
            }

            for(int i = 3; i <= n; i = i + 2){
                while(n % i == 0){
                    if(n - i == 0){
                        System.out.println(" "+i);
                        break;
                    }else{
                        System.out.print(" "+i+" *");
                        n /= i;
                    }
                }
            }
        }
    }
}
