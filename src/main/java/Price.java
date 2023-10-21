import java.util.Scanner;
public class Price {
    Scanner sc = new Scanner(System.in);
    double prodPrice;

    public double setProdPrice(){
        System.out.println("Введите цену на товар: ");
        while (true){
            if (sc.hasNextDouble()) {
            prodPrice = sc.nextDouble();
            }else sc.next();
            if (prodPrice > 1) {
            break;
            } else System.out.println("Введите цену в формате 1.11 либо 1");
        }
        return prodPrice;
    }
}
