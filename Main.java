public class Main {
    public static void main(String[] args) {
        System.out.println("Hi! This Tool name is Mathematics.");
        
        Menu menu = new Menu();
        Input nInput = new Input();
        Explain explain = new Explain();

        menu.printMenu1();
        int num = nInput.inputNum();
        System.out.print("Your choice is ");
        explain.printText(num);

        switch (num){
            case 0:
                System.out.println("Finish. Bye!");
                break;
            case 1:
                Fact nFact = new Fact();
                nFact.nFact();
                break;
            case 2:
                Euclid nEuclid = new Euclid();
                nEuclid.nEuclid();
                break;
            case 3:
                Collatz nCollatz = new Collatz();
                nCollatz.nCollatz();
                break;
        }
    }
}
