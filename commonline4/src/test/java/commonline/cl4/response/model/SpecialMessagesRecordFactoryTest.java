package commonline.cl4.response.model;

import junit.framework.TestCase;

import java.util.List;
import java.util.Arrays;


public class SpecialMessagesRecordFactoryTest extends TestCase {

    public void test() {
        SpecialMessagesRecordFactory factory = new SpecialMessagesRecordFactory();

        List fields = Arrays.asList(new String[]{
           "@3", "message1","message2","message3","message4","message5", "filler", "*", "\r\n"
        });

        Object obj = factory.build(fields, null);
        assertNotNull(obj);
        assertTrue(obj instanceof SpecialMessages);

        SpecialMessages messages = (SpecialMessages) obj;
        assertEquals("message1", messages.getMessage1());
        assertEquals("message2", messages.getMessage2());
        assertEquals("message3", messages.getMessage3());
        assertEquals("message4", messages.getMessage4());
        assertEquals("message5", messages.getMessage5());
    }
}