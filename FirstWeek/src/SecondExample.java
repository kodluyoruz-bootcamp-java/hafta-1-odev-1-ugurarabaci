public class SecondExample {
//2- Bir araba nesnesi oluşturup bu arabaya ait özellikleri kurucu methodlar sayesinde tanımlayabildiğimiz bir sınıf yazınız.
    public static void main(String[] args) {
        Car Araba = new Car("Tesla", "Siyah", "Elektrikli", 240);
        Car Araba2 = new Car();
        Araba.infos();
        Araba2.infos();

    }
}
