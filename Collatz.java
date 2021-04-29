class Collatz {
    public void nCollatz(){
        Input nInput = new Input();
        int n = nInput.inputOne();
        
        System.out.print(n);
        int i = 0;
        while(n > 1){
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(" -> "+n);
            i++;
            if(i % 10 == 0){
                System.out.println();
            }
        }
    }
}
