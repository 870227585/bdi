public class Body {
    public class Heart{
        public void beat(){
            System.out.println("xinzangtiaodong");
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void method(){
        System.out.println("外部类的方法");
        Heart heart = new Heart();
        heart.beat();
    }

}
