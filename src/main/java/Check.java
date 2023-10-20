import java.util.Scanner;
public class Check {
    Scanner sc = new Scanner(System.in);
    int freandsCheck;
    public int setCheck(){
        System.out.println("Укажите число на скольких людей разделить счет?");
        while (true){
            if (sc.hasNextInt()) {
                freandsCheck = sc.nextInt();
            }else {sc.next();}
            if (freandsCheck > 1) {
                break;
            } else System.out.println("Укажите число и оно должно быть больше 1");
            }
        return freandsCheck;
    }
}