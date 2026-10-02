import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Person person = new Person(
                "Sigma",
                "Johnes",
                LocalDate.of(1969, 5, 12),
                "Zbąszynek",
                "SigmaJOhnes@gmail.com",
                "123456789"
        );

        PersonHistory history = new PersonHistory();

        // Stan początkowy
        history.save(person);

        // Zmiana danych
        person.setImie("Dżosz");
        person.setEmail("dzosz.kowalski@example.com");

        // Zapisanie drugiej wersji
        history.save(person);

        // Kolejna zmiana
        person.setNazwisko("Nowak");
        person.setTelefon("987654321");

        System.out.println("Aktualny stan:");
        System.out.println(person);

        // Przywrócenie pierwszej wersji
        history.restore(person, 0);

        System.out.println("\nPo przywróceniu pierwszej wersji:");
        System.out.println(person);

        // Przywrócenie drugiej wersji
        history.restore(person, 1);

        System.out.println("\nPo przywróceniu drugiej wersji:");
        System.out.println(person);
    }
}
