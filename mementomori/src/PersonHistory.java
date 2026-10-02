import java.util.ArrayList;
import java.util.List;

public class PersonHistory {

    private final List<PersonBackup> backups = new ArrayList<>();

    public void save(Person person) {
        backups.add(person.save());
    }

    public PersonBackup get(int index) {
        return backups.get(index);
    }

    public int size() {
        return backups.size();
    }

    public void restore(Person person, int index) {
        PersonBackup backup = backups.get(index);
        person.restore(backup);
    }
}
