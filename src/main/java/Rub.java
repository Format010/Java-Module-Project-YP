public class Rub {
    public String ruBl(double prodPrice){
        if ((int)(prodPrice % 100 / 10) == 1){
            return " рублей.";
        }
        switch ((int) (prodPrice % 10)){

            case 1:
                return " рубль.";
            case 2:
            case 3:
            case 4:
                return " рубля.";
            default:
                return " рублей.";

        }
    }
}