import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Calc calc = new Calc();
        Rub rub = new Rub();

        Scanner sc = new Scanner(System.in);
        Check check = new Check();
        int backFrCh = check.setCheck();

        String prodName = "";
        String sumProdName;
        double prodPrice = 0;
        double sumProdPrice = 0;
        while (true) {
            System.out.println("Введите название товара: ");
            prodName = sc.nextLine();
            sumProdName = calc.setConcProdName(prodName);

            do {
                System.out.println("Введите цену на товар: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Введите корректное число в формате 0.00 либо 0");
                    sc.next();
                }
                prodPrice = sc.nextDouble();
                prodPrice = calc.setSumProdPrice(prodPrice);
            } while (prodPrice < 0);
            sc.nextLine(); // стираем остатки

            System.out.println("Товар успешно добавлен!");
            System.out.println("Если хотите добавить еще один товар нажмите Enter. \nДля подсчета результата напишите Завершить");
            String stopWord = sc.nextLine();
            String exitWord = "завершить";
            boolean retVal;
            retVal = stopWord.equalsIgnoreCase(exitWord);
            if (retVal == true) {
                break;
            }
        }
        System.out.println(sumProdName);
        prodPrice /= backFrCh;
        String rubl = rub.ruBl(prodPrice);
        String result = String.format("%.2f",prodPrice);
        System.out.println("Каждый гость должен заплатить: " + result + rubl);

    }
}
