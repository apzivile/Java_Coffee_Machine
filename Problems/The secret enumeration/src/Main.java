enum Secret {
    STAR, CRASH, START;
}

public class Main {

    public static void main(String[] args) {
        int count = 0;

        Secret secret ;
        String secrets = secret.toString();

        if (secrets.startsWith("STAR")) {
            count++;
        }


        System.out.println(count);
    }
}
 /*At least two constants start with STAR

*/