package DesignPatterns.structural.AdaptorDesignPattern;

public class Client {
    public static void main(String[] args) {

        BirInterface birInter2 = new StandartSinif();
        birInter2.call();
        // Kullanilmak istenen sinifi kullanabilmek için araya bir adaptor sinifi koymak durumunda kaldık
        // Adaptor sinifi bir interface i kullanıyor ve bir interface de neye ihtiyaç var ise onu kullanmak istenen sinifa bağlıyor.
        // bu sayede kullanılmak istenen sınıfta bir değişiklik yapmadan adapte etmiş olduk.
        BirInterface birInter = new AdaptorSinif();
        birInter.call();
    }
}
