import org.junit.jupiter.api.Assertions;

public class TestContactGetname {

    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        // given:
        final Contact originalContact = new Contact("Вася", "111");
        final String expected = "Вася";
        // when:
        final String result = originalContact.getName();

        // then:
        Assertions.assertEquals(expected, result);

    }
}
