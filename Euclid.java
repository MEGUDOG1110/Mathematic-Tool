class Euclid {
    public void nEuclid() {
        Input nInput = new Input();
        Explain explain = new Explain();
        explain.exEuclid();
        int[] n = nInput.inputTwo();

        int bar = 0;
        if (n[0] < n[1]){
            bar = n[0];
            n[0] = n[1];
            n[1] = bar;
        }

        int x = n[0];
        int y = n[1];
        int c;
        int d = y;
        int num = 0;
        

        while (d > 0) {
            num++;
            c = x / y;
            d = x % y;
            System.out.println(num+" | "+x+" / "+y+" = "+c+" … "+d);
            x = y;
            y = d;
        }
        System.out.println("GCD of "+n[0]+" & "+n[1]+" is "+x);
    }
}
