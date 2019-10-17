public class Demo01array {
    public static void main(String[] args) {
        person[] array = new person[3];
        person one = new person("迪丽热巴",18);
        person two = new person("古力娜扎",28);
        person three = new person("马儿扎哈",38);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[0].getName());

    }
}
