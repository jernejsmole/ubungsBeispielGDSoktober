public class ZinsDemo {
    public static double zinsenberechung(double kontostand, double zinsen){
        double total = kontostand + kontostand * (zinsen/100);
        return total;

    }
    public static void main(String[] args) {
        double kontostand = 15000;
        double zinsen = 2.25;



        System.out.println(zinsenberechung(kontostand,zinsen));
    }
}
