package projeler.encapsulationPassword;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserMain {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();

         int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen username girin");
        List<User> list = new ArrayList<User>();
        user1.setUserName(scan.next());
        while(count <1) {
            System.out.println("Lutfen password girin");
            user1.setPassword(scan.next());
            if (user1.getPassword().length()<6){
                System.out.println("Lurfen 6 haneli password girin");
            }else{
                count++;
            }


        }
        count = 0;
        list.add(user1);
        System.out.println("Lutfen username girin");

        user2.setUserName(scan.next());
        while(count <1) {
            System.out.println("Lutfen password girin");
            user2.setPassword(scan.next());
            if (user2.getPassword().length()<6){
                System.out.println("Lurfen 6 haneli password girin");
            }else{
                count++;
            }


        }
        list.add(user2);
        System.out.println(list);

    }


}
