import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int summoney, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        int leftmoney = super.getMoney();
        if (leftmoney < summoney) {
            System.out.println("余额不足");
            return list;
        } else {
            leftmoney = leftmoney - summoney;
            super.setMoney(leftmoney);
            int average = summoney / count;
            int m = summoney % count;
            for (int i = 0; i < count - 1; i++) {
                list.add(average);
            }
            list.add(average+m);
            return list;
        }
    }
}
