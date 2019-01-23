import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItems;

/**
 * Created by Manish Tiwari on 1/23/2019.
 */

public class GenericsTester {

    @Test
    public void testFromArrayToList() {
        Integer[] integers = {1, 2, 3, 4};
        List<String> intAsStrings=Generics.fromArrayToList(integers, Object::toString);
        assertThat(intAsStrings,hasItems("1","3","2","4"));
    }


}
