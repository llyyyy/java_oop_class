import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by AppleMint on 14. 10. 17..
 */
public class test01_jh {

    @Test
    public void addTest01(){
        int a = 7;
        int b = 8;

        assertThat(a+b,is(15));
    }
}



