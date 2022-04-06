import org.junit.jupiter.api.Assertions;

public class TestPhoneNumber {

    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        // given:
        final Contact originalContact = new Contact("Вася", "111");
        final String expected = "111";
        // when:
        final String result = originalContact.getPhoneNumber();

        // then:
        Assertions.assertEquals(expected, result);

    }
}