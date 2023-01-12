import org.junit.Assert

public class PersonTest {
    public int age;

    public void PersonTest(int newAge) {
        boolean result = Person.isTeenager(age);
        if (newAge < 0) {
            return;
        }
        age = newAge;
    }
}