package pl.sda.builder;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        User user = new User.Builder()
                .name("Jan")
                .password("123546")
                .active(true)
                .postalCode("87-100")
                .city("Torun")
                .lastName("Kowalski").build();
        System.out.println(user);

    }
}
