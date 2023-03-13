package ru.netology.poster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindLastNotDefaultTest {

    Poster poster1 = new Poster(1, "Бладшот", "боевик", false);
    Poster poster2 = new Poster(2, "Вперёд", "мультфильм", false);
    Poster poster3 = new Poster(3, "Отель «Белград»", "комедия", false);
    Poster poster4 = new Poster(4, "Джентльмены", "боевик", false);
    Poster poster5 = new Poster(5, "Человек-невидимка", "ужасы", false);
    Poster poster6 = new Poster(6, "Тролли. Мировой тур", "мультфильм", true);
    Poster poster7 = new Poster(7, "Номер один", "комедия", true);

    @Test
    public void findLastOverDefault() {
        PosterManager manager = new PosterManager(6);
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);

        Poster[] expected = { poster7, poster6, poster5, poster4, poster3, poster2 };
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastUnderDefault() {
        PosterManager manager = new PosterManager(4);
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);

        Poster[] expected = { poster7, poster6, poster5, poster4 };
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastIfPostersNotEnough() {
        PosterManager manager = new PosterManager(8);
        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);

        Poster[] expected = { poster7, poster6, poster5, poster4, poster3, poster2, poster1 };
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
