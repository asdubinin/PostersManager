package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ThirdPostersManagerTest {

    PostersManager manager = new PostersManager();

    MovieItems item1 = new MovieItems(1, "Bloodshot","Action", false );

    @Test
    public void shouldAddNewMovies() {

        MovieItems[] expected = {item1};
        MovieItems[] actual = manager.save(item1);

        Assertions.assertArrayEquals(expected, actual);

    }

}

