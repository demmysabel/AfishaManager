import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest {
    @Test
    public void shouldAddTenMovie() {
        MovieManager manager = new MovieManager();
        Movie one = new Movie(111, "One", "drama");
        Movie two = new Movie(222, "Two", "drama");
        Movie three = new Movie(333, "Three", "drama");
        Movie four = new Movie(444, "Four", "drama");
        Movie five = new Movie(555, "Five", "drama");
        Movie six = new Movie(666, "Six", "drama");
        Movie seven = new Movie(777, "Seven", "drama");
        Movie eight = new Movie(888, "Eight", "drama");
        Movie nine = new Movie(999, "Nine", "drama");
        Movie ten = new Movie(1010, "Ten", "drama");
        Movie eleven = new Movie(1111, "Eleven", "drama");
        Movie twelve = new Movie(1212, "Twelve", "drama");

        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);
        manager.addMovie(twelve);

        Movie[] actual = manager.findLast();
        Movie[] expected = new Movie[]{twelve, eleven, ten, nine, eight, seven, six, five, four, three};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFiveMovie() {
        MovieManager manager = new MovieManager(5);
        Movie one = new Movie(111, "One", "drama");
        Movie two = new Movie(222, "Two", "drama");
        Movie three = new Movie(333, "Three", "drama");
        Movie four = new Movie(444, "Four", "drama");
        Movie five = new Movie(555, "Five", "drama");
        Movie six = new Movie(666, "Six", "drama");
        Movie seven = new Movie(777, "Seven", "drama");
        Movie eight = new Movie(888, "Eight", "drama");
        Movie nine = new Movie(999, "Nine", "drama");
        Movie ten = new Movie(1010, "Ten", "drama");

        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);

        Movie[] actual = manager.findLast();
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindMoreThanTen() {
        MovieManager manager = new MovieManager(15);
        Movie one = new Movie(111, "One", "drama");
        Movie two = new Movie(222, "Two", "drama");
        Movie three = new Movie(333, "Three", "drama");
        Movie four = new Movie(444, "Four", "drama");
        Movie five = new Movie(555, "Five", "drama");
        Movie six = new Movie(666, "Six", "drama");
        Movie seven = new Movie(777, "Seven", "drama");
        Movie eight = new Movie(888, "Eight", "drama");
        Movie nine = new Movie(999, "Nine", "drama");
        Movie ten = new Movie(1010, "Ten", "drama");

        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);

        Movie[] actual = manager.findLast();
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six, five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        MovieManager manager = new MovieManager(15);
        Movie one = new Movie(111, "One", "drama");
        Movie two = new Movie(222, "Two", "drama");
        Movie three = new Movie(333, "Three", "drama");
        Movie four = new Movie(444, "Four", "drama");
        Movie five = new Movie(555, "Five", "drama");
        Movie six = new Movie(666, "Six", "drama");
        Movie seven = new Movie(777, "Seven", "drama");
        Movie eight = new Movie(888, "Eight", "drama");
        Movie nine = new Movie(999, "Nine", "drama");
        Movie ten = new Movie(1010, "Ten", "drama");

        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.findAll();

        Movie[] actual = manager.findAll();
        Movie[] expected = new Movie[]{one, two, three, four, five, six, seven, eight, nine, ten};
        assertArrayEquals(expected, actual);
    }
}
