package PatternTask.Proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("D:/images/my.jpg");
        image.display();
    }
}
