import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class Hamcrest {
    @Test
    public void test() {
        int sum = 2;
        assertThat("Some test ", sum, equalTo(2));
        assertThat(sum, is(not(3)));
        assertThat(sum, greaterThan(0));
    }
}
