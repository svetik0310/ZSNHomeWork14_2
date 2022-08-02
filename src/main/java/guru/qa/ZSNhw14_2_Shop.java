package guru.qa;

public class ZSNhw14_2_Shop {
    public static void main(String[] args) {
        double fixmoney =Math.random()*4000;
        int countwant=6;
        System.out.println("Сколько денег есть"+fixmoney);
        Products avacado=new Products(12334,"Авакадо",100,123.89);
        avacado.aboutProducts();
        if (avacado.canSales(countwant) && avacado.havemoney(avacado.takePrice(countwant),fixmoney))
        {
            System.out.println("Покупка итоговая цена "+ avacado.takePrice(countwant));
            avacado.salesProduct(countwant);
        }
        else {
            System.out.println("Не хватает денег");
        }
        avacado.aboutProducts();
    }
}
