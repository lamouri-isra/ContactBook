package lamouri.Isra;

public interface  Manageable {

    void add(Contact contact);
    Contact search(String name);
    boolean remove(String name);
    boolean shareContact(String name, ContactBook targetContactBook);
}
