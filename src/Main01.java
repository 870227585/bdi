public class Main01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.poweron();
        Usb usb = new Mouse();
        computer.Usedevice(usb);

        Keyboard keyboard = new Keyboard();
        computer.Usedevice(keyboard);


        computer.poweroff();
    }
}
