import java.time.LocalDate;

public class Person {

    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private String miejsceUrodzenia;
    private String email;
    private String telefon;

    public Person(String imie, String nazwisko, LocalDate dataUrodzenia,
                  String miejsceUrodzenia, String email, String telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.miejsceUrodzenia = miejsceUrodzenia;
        this.email = email;
        this.telefon = telefon;
    }

    // Gettery i settery

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getMiejsceUrodzenia() {
        return miejsceUrodzenia;
    }

    public void setMiejsceUrodzenia(String miejsceUrodzenia) {
        this.miejsceUrodzenia = miejsceUrodzenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    // Utworzenie Memento
    public PersonBackup save() {
        return new PersonBackup(
                imie,
                nazwisko,
                dataUrodzenia,
                miejsceUrodzenia,
                email,
                telefon
        );
    }

    // Przywrócenie stanu z Memento
    public void restore(PersonBackup backup) {
        this.imie = backup.getImie();
        this.nazwisko = backup.getNazwisko();
        this.dataUrodzenia = backup.getDataUrodzenia();
        this.miejsceUrodzenia = backup.getMiejsceUrodzenia();
        this.email = backup.getEmail();
        this.telefon = backup.getTelefon();
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", miejsceUrodzenia='" + miejsceUrodzenia + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
