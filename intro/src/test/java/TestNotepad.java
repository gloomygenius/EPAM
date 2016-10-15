import task06.Notepad;

public class TestNotepad {
    public static void main(String[] args) {
        Notepad notepad=new Notepad(40);
        notepad.addNote("My first note");
        notepad.addNote("My second note");
        notepad.addNote("My third note");
        notepad.addNote("My fourth note");
        notepad.addNote("My fifth note");
        System.out.println("Removing second note... ");
        notepad.removeNote(2);
        System.out.println("Show all notes:");
        notepad.showAllNotes();
        notepad.editNote(3,"modified note");
        notepad.showAllNotes();
        notepad.editNote(40,"modified note");
    }
}