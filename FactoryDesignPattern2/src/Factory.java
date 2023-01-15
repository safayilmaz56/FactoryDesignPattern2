public class Factory {
    public ICar aracOlustur(String tur,String renk,double fiyat){
        if(tur.equals("BMW")) {
            return new BMW("siyah", 1000000);
        }
        else if (tur.equals("Audi")) {
            return new Audi("beyaz",1250000);
        }
        else {
            throw new RuntimeException(tur +" markasinin uretimi desteklenmemektedir");
        }

    }
}
