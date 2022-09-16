package rc.bootsecurity.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LabelsTest {
    Labels labels = new Labels(0, "name", "category", "description");

    @Test
    void testToString() {
        String result = labels.toString();
        Assertions.assertEquals("Name='name', category='category', description='description'", result);
    }

    @Test
    void testSetLabel_id() {
        labels.setLabel_id(0);
    }

    @Test
    void testSetName() {
        labels.setName("name");
    }

    @Test
    void testSetCategory() {
        labels.setCategory("category");
    }

    @Test
    void testSetDescription() {
        labels.setDescription("description");
    }

    @Test
    void testEquals() {
        boolean result = labels.equals("o");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testCanEqual() {
        boolean result = labels.canEqual("other");
        Assertions.assertEquals(false, result);
    }

}

