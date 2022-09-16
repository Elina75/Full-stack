package rc.bootsecurity.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyFavouriteTest {
    MyFavourite myFavourite = new MyFavourite(0, 0, "title", "daytime");

    @Test
    void testSetUser_cart_id() {
        myFavourite.setUser_cart_id(0);
    }

    @Test
    void testSetRecipe_id() {
        myFavourite.setRecipe_id(0);
    }

    @Test
    void testSetTitle() {
        myFavourite.setTitle("title");
    }

    @Test
    void testSetDaytime() {
        myFavourite.setDaytime("daytime");
    }

    @Test
    void testEquals() {
        boolean result = myFavourite.equals("o");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testCanEqual() {
        boolean result = myFavourite.canEqual("other");
        Assertions.assertEquals(false, result);
    }


    @Test
    void testToString() {
        String result = myFavourite.toString();
        Assertions.assertEquals("MyFavourite(user_cart_id=0, recipe_id=0, title=title, daytime=daytime)", result);
    }
}

