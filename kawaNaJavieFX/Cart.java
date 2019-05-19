import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> productList;

    public Cart() {
        productList = new ArrayList<Product>();
    }

    public void add(int index){
        productList.add(new Product(index, SETTINGS.names[index], SETTINGS.prices[index]));
    }

    public void empty(){
        for(Product product : productList){
            SETTINGS.returnToStock(product.getId());
        }
        productList.clear();
    }

    String sumOfPurchases(){
        double sum = 0;
        for(Product product : productList){
            sum += product.getPrice();
        }
        return (String.format("%.2f", sum));
    }

    int coutOfProducts(){
        return productList.size();
    }

    int[] generateInvoiceData(){
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (Product product : productList) {
            array[product.getId()]++;
        }
//        System.out.println("array " + array);
//        for (int i:array
//             ) {
//            System.out.print(i+ ", ");
//        }
        return array;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productList=" + productList +
                '}';
    }
}
