import org.junit.jupiter.api.Assertions;
import org.w3c.dom.ls.LSOutput;

public class TestToString {

    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        // given:
        final Contact originalContact = new Contact("Вася", "111");
        final String expected = "Вася -> 111";
        // when:
         String result = originalContact.toString();

        // then:
        Assertions.assertEquals(expected, result);

    }

}
