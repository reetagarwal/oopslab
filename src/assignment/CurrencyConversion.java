package assignment;

public class CurrencyConversion implements currency{

    @Override
    public void moneyConversion() {
        System.out.println("money converted");
    }

    @Override
    public void countryCurrency() {
        System.out.println("country currency converted");
    }

    public static void main(String[] args) {
        CurrencyConversion cc=new CurrencyConversion();
        cc.countryCurrency();
        cc.moneyConversion();
    }
}

