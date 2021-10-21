package pkg;

public class Main {

    // na memoization jak u faktorialu tak u fibonacciho sekvence nikdo nema cas
    // funkce s jednim radkem je hezci preci :)
    // double pro alokaci vic bitu pro vysledek, umoznuje praci s vyssima hodnotama
    private double fibonacci(int n) {
        return n > 1 ? fibonacci(n - 1) + fibonacci(n - 2) : n;
    }

    private double factorial(int n) {
        return n > 1 ? (n * factorial(n - 1)) : 1;
    }

    //Vypsat prvnich N clenu geometricke posloupnosti
    //a0 = 1
    //an = an-1*q
    //parametry 2 - pocet clenu, q
    private void geomSeq(int amount, int q) {
        int num = 1; //a0
        for (int i = 0; i < amount; i++) {
            num *= q;
            System.out.println(num);
        }
    }

    private Main() {
        System.out.println(factorial(6)); //6 => 720
        System.out.println(fibonacci(6)); //6 => 7
        geomSeq(5, 2); //32
    }

    public static void main(String[] args) {
        new Main();
    }
}
