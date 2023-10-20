public class Calc {
    String concProdName = "Список товаров:\n";
    double sumProdPrice;
    public String setConcProdName (String prodName) { //Метод складывания названий товаров
        return concProdName += prodName + " \n";
    }
    public double setSumProdPrice (double prodPrice) { //Метод подсчета суммы товаров
        return sumProdPrice += prodPrice;

    }
}
