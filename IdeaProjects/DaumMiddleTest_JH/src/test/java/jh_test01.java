import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by AppleMint on 14. 10. 17..
 */
public class jh_test01 {


    @Test
    public void testAdd() {
        int a = 7;
        int b = 8;
        assertThat(a+b,is(15));
    }
}
