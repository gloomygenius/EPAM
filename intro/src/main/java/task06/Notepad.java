package task06;

/** Блокнот для записей
 *
 *  Данный класс позволяет создовать объекты типа "блокнот" с желаемым количеством записей.
 *  Записи в блокнот можно добавлять и удалять
 *  @author Vasiliy Bobkov
 */
public class Notepad {
    private int notepadSize = 20;
    private Note[] notes;

    public Notepad() {
        notes = new Note[notepadSize];
    }

    public Notepad(int notepadSize) {
        notes = new Note[notepadSize];
    }

    public void addNote(String newText) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                notes[i] = new Note();
                notes[i].setTextOfNote(newText);
                return;
            }
        }
        System.out.println("Нет места для новых записей");
        return;
    }

    public void removeNote(int index) {
        notes[index] = null;
        return;
    }

    public void editNote(int index, String newText) {
        notes[index].setTextOfNote(newText);
    }

    public void showAllNotes() {
        for (int i = 0; i < notepadSize; i++) {
            if (notes[i] == null) continue;
            System.out.println(notes[i].getTextOfNote());
        }
        return;
    }
}
