package tests;

public class Butelka {

    private double capacity;
    private static Butelka[] butelka = new Butelka[50];

    Butelka(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    private void fillBootle(double value) {
        this.capacity += value;
    }

    private static void pourBootle(Butelka butelka1, Butelka butelka2, double value) {
        if (value <= butelka1.getCapacity()) {
            butelka1.removeFromBootle(value);
            butelka2.fillBootle(value);
        } else System.out.println("Nie ma wystarczającej ilości płynu w butelce.");
    }

    private void removeFromBootle(double value) {
        this.capacity -= value;
    }

    private static void checkStatus(Butelka... bootle) {
        for (Butelka b : bootle) {
            System.out.println("Ilość płynu w butelce nr " + butelka[1] + " " + b.getCapacity());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < butelka.length; i++) {
            butelka[i] = new Butelka(1.25);
            System.out.println(i + 1 + ": " + butelka[i].getCapacity());
        }

        pourBootle(butelka[1], butelka[2], 1.25);
        checkStatus(butelka[1], butelka[49]);
        pourBootle(butelka[1], butelka[2], 1);
    }


}
