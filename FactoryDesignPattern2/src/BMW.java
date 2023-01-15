public class BMW implements ICar{
    private String renk;
    private double fiyat;

    public BMW(String renk, double fiyat) {
        this.renk = renk;
        this.fiyat = fiyat;
    }

    @Override
    public String getRenk() {
        return renk;
    }

    @Override
    public double getFİyat() {
        return fiyat;
    }
}
