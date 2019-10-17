import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Manager rui = new Manager("李睿", 100);
        Member one = new Member("s",20);
        Member two = new Member("b",20);
        Member three = new Member("c",20);
        rui.show();
        one.show();
        two.show();
        three.show();
        System.out.println("============================");


        list = rui.send(110, 4);


        one.receive(list);
        two.receive(list);
        three.receive(list);
        rui.show();
        one.show();
        two.show();
        three.show();

    }
}
