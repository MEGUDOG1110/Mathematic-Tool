public class Main {
    public static void main(String[] args) {
        Explain explain = new Explain();
        Menu menu = new Menu();
        System.out.print("\033[H\033[2J");
        explain.printName();
        menu.Menu();
    }
}
