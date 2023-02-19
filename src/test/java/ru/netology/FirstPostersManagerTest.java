package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstPostersManagerTest {

    PostersManager manager = new PostersManager();

    MovieItems item1 = new MovieItems(1, "Bloodshot","Action", false );
    MovieItems item2 = new MovieItems(2, "Forward","Cartoon", false );
    MovieItems item3 = new MovieItems(3, "Hotel Belgrad","Comedy", false );
    MovieItems item4 = new MovieItems(4, "Gentlemen","Action", false );
    MovieItems item5 = new MovieItems(5, "Invisible man","Horror", false );
    MovieItems item6 = new MovieItems(6, "Trolls World tour","Cartoon", true );
    MovieItems item7 = new MovieItems(7, "Number one","Comedy", true );

    @BeforeEach

    public void setup() {
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

    }
    @Test
    public void shouldGetLastMovies() {

        MovieItems[] expected = {item7, item6, item5, item4, item3, item2, item1 };
        MovieItems[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldFindAllItems() {
        MovieItems[] expected = {item1, item2, item3, item4, item5, item6, item7 };
        MovieItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


}

