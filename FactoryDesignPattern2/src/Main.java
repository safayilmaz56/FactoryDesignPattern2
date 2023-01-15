public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        ICar car = factory.aracOlustur("Audi","beyaz",1250000);
        System.out.println(car.getFİyat());

    }
}