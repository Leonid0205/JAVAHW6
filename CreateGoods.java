public class CreateGoods {
    Goods temp;

    public CreateGoods(){
        temp = new Goods();
        temp.count = CONNST.REGULARCOUNT;
        temp.name = CONNST.EMPTY;
        temp.price = CONNST.REGULARPRICE;
        temp.description = CONNST.EMPTY;
    }
    public CreateGoods setCount(int count) {
        temp.count = count;
        return this;
    }
    public CreateGoods setName(String name) {
        temp.name = name;
        return this;
    }
    public CreateGoods setPrice(Double price) {
        temp.price = price;
        return this;
    }
    public CreateGoods setDescription(String desciption) {
        temp.description = desciption;
        return this;
    }
    public Goods Create(){
        return temp;
    }
    public void printCreateGoods(){
        System.out.println(
            String.format("Name: %s | Count: %d | Price: %.2f | Description: %s",
                temp.name,
                temp.count,
                temp.price,
                temp.description));
    }
}