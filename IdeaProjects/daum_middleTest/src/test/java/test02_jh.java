import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
        import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by AppleMint on 14. 10. 17..
 */
public class test02_jh {

    @Test
    public void multest02() {
        int a = 3;
        int b = 3;

        assertThat(a*b, is(9));
    }
}
