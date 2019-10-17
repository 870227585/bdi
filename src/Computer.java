public class Computer {
    public void poweron() {
        System.out.println("打开电脑");
    }

    public void poweroff() {
        System.out.println("关闭电脑");
    }
    public void Usedevice(Usb usb){

        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = new Mouse();
            mouse.click();
        }
        else if(usb instanceof Keyboard){
            Keyboard keyboard = new Keyboard();
            keyboard.type();
        }
        usb.close();
    }
}
