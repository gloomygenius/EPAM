package task06;

public class Notepad {
    private int notepadSize = 20;
    private Note[] notes = new Note[notepadSize];
    public Notepad(int notepadSize) {
        this.notepadSize = notepadSize;
    }
    public void addNote(String newText) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i]==null) {
                notes[i]=new Note();
                notes[i].setTextOfNote(newText);
                return;
            }
        }
        System.out.println("Нет места для новых записей");
        return;
    }

    public void removeNote(int index) {
        notes[index]=null;
        return;
    }

    public void editNote(int index, String newText) {
        notes[index].setTextOfNote(newText);
    }

    public void showAllNotes() {
        for (int i = 0; i < notepadSize; i++) {
            if (notes[i]==null) continue;
            System.out.println(notes[i].getTextOfNote());
        }
        return;
    }
}
