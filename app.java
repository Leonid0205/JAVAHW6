/**
Описать построителя товаров
 */
public class app {

    public static void main(String[] args) {
        CreateGoods goods = new CreateGoods();
        System.out.print("Default ");
        goods.printCreateGoods();
        goods = new CreateGoods()
                    .setCount(2)
                    .setDescription("delicious meal")
                    .setName("Pasta")
                    .setPrice(1.99);
        goods.printCreateGoods();
        CreateGoods goods1 = new CreateGoods()
                                .setCount(40)
                                .setDescription("italian pasta made of dough with various fillings")
                                .setName("Ravioli ")
                                .setPrice(2.99);
        goods1.printCreateGoods();                        
        CreateGoods goods2 = new CreateGoods()
                                .setCount(21)
                                .setDescription("Italian fresh cheese made from cream and milk of buffalo or cow")
                                .setName("Buratta ")
                                .setPrice(3.99);
        goods2.printCreateGoods();
    }
}