public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("123.jpg");

        image.display();

        System.out.println("");
        image.display();
    }
}
