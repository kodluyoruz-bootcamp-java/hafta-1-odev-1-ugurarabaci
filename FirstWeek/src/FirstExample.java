public class FirstExample {
//1- 0 ile 2000 arasında 3,5,7 ve 53’e bölünebilen sayıların ağırlıklı ortalamasını bulan bir uygulama yazınız.

    public static void main(String[] args) {
        double sum = 0;
        double counter=0;
        for (int i = 0; i < 2000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0) && (i % 53 == 0)) {
                sum += i;
                counter++;
            }
        }
        System.out.println(sum/counter);
    }
}
