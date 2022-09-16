package globalsoftwaresupport;

public class App {
    public static void main(String[] args) {

        for (Integer i = 0; i < 100; i++) {
            System.out.println(SHA256Helper.generateHash(i.toString()));
        }

    }
}
