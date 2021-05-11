class Function extends Menu{
    public void function(String x, int y){
        Input nInput = new Input();
        
        if(x=="J"){ //中学数学メニュー
            switch(y){
                case 1:
                    Fact nFact = new Fact();
                    nFact.nFact();
                    break;
                default:
                    System.out.println("Input Error!");
                    nInput.inputContinue();
            }
        }else if (x=="H"){ //高校数学メニュー
            switch(y){
                case 1:
                    Euclid nEuclid = new Euclid();
                    nEuclid.nEuclid();
                    break;
                default:
                    System.out.println("Input Error!");
                    nInput.inputContinue();
            }
        }else if(x=="O"){ //その他メニュー
            switch (y) {
                case 1:
                    Collatz nCollatz = new Collatz();
                    nCollatz.nCollatz();
                    break;
                default:
                    System.out.println("Input Error!");
                    nInput.inputContinue();
            }
        }
        nInput.inputContinue();
    }
}