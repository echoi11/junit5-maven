import org.junit.jupiter.api.Test;

//This class will not be tested by default.
//Class name must be Test*.java or *Test.java.  Case-sensitive.
public class Excludedtest {
    @Test
    public void sleep_for_1_sec() throws InterruptedException {
        System.out.println("Sleeping for 1 sec");
        Thread.sleep(1000L);
    }
}