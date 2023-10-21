import java.util.Scanner;
public class Check {
    Scanner sc = new Scanner(System.in);
    int friendsCheck;
    public int readFriendsCount(){
        System.out.println("Укажите число на скольких людей разделить счет?");
        while (true){
            if (sc.hasNextInt()) {
                friendsCheck = sc.nextInt();
            }else {sc.next();}
            if (friendsCheck > 1) {
                break;
            } else System.out.println("Укажите число и оно должно быть больше 1");
            }
        return friendsCheck;
    }
}