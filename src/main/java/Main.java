import bean.Consumer;
import validation.NullValidation;
import validation.Validation;
import java.util.List;
import static java.util.Arrays.asList;

public class Main {

    private static final Validation<Consumer> validation = new Validation<>();

    public static void main(String[] args) {
        List<Consumer> list = asList(new Consumer("FirstName1", "LastName1"),
                new Consumer(null, "LastName2"),
                new Consumer("FirstName3", "LastName3"),
                new Consumer("FirstName4", null),
                new Consumer("FirstName5", "LastName5"));

        NullValidation<Consumer> filterA = (Consumer c) -> c.getLastName() == null
                || c.getFirstName() == null;
        NullValidation<Consumer> filterB = (Consumer c) -> c.getLastName() != null
                && c.getFirstName() != null;

        validation.filter(list, filterA)
                .forEach(System.out::println);


        System.out.println("-------------------------------------------");

        validation.filter(list, filterB)
                .forEach(System.out::println);
    }
}
