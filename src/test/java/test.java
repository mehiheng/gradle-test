import org.junit.Test;
import org.mockito.Mockito;


import java.util.LinkedList;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;

public class test {
    @Test
    public void testMockClass() throws Exception {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        String value = "first";
        Mockito.when(mockedList.get(0)).thenReturn(value);

        assertEquals(mockedList.get(0), value);

    }
}
