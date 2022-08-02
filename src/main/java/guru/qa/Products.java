package guru.qa;

public class Products {
   private String name;
   private int articul;
   private double cost;
   private int count;

    public Products(int articul, String name,int count,double cost) {
        this.articul = articul;
        this.name = name;
        this.count = count;
        this.cost=cost;
    }
    public void aboutProducts() {
        System.out.println("Артикуль: " + articul);
        System.out.println("Наименование: " + name);
        System.out.println("Колличество: " + count);
        System.out.println("Цена: " + cost);
    }
    public boolean canSales(int count) {
        return this.count >= count;
    }
    public double takePrice(int count) {
        if (this.count>=count)  return this.cost*count;
        else return 0;
    }
    public void salesProduct(int count) {
             this.count-=count;
            System.out.println("Успешная покупка товара "+this.articul);
    }
    public boolean havemoney(double allcheck,double money)
    {
        if(Double.compare(money,allcheck)>0) return true;
        else return Double.compare(money, allcheck) == 0;
    }

}
