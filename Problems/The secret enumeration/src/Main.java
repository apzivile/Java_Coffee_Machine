
public class Main {

    public static void main(String[] args) {
        Secret[] values = Secret.values();
        int counter = 0;

        String s;

        for (int i = 0; i < values.length; i++) {
            s = values[i].toString();
            if (s.startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...

}
 */