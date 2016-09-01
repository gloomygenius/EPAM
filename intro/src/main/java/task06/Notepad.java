package task06;

/** Блокнот для записей.
 *
 *  Данный класс позволяет создовать объекты типа "блокнот" с желаемым количеством записей.
 *  Записи в блокнот можно добавлять и удалять
 *  @author Vasiliy Bobkov
 */
public class Notepad {
    private int notepadSize = 20;
    private Note[] notes;

    /** Создаёт ноый объект Notepad.
     *
     * Инициализируется массив записей с дефолтовым размером
     */
    @SuppressWarnings("unused")
    public Notepad() {
        notes = new Note[notepadSize];
    }

    /** Создаёт новый объект Notepad с указанным размером.
     *
     * Инициализируется массив записей с указанным размером
     * @param notepadSize
     * Размер массива записей
     */
    public Notepad(int notepadSize) {
        notes = new Note[notepadSize];
    }

    /** Добавляет новую запись.
     *
     * Добавляет новую запись. Если нет места для свободных записей, то выводится соответствующее сообщение
     * @param newText
     * Текст новой записи.
     */
    public void addNote(String newText) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                notes[i] = new Note();
                notes[i].setTextOfNote(newText);
                return;
            }
        }
        System.out.println("Нет места для новых записей");

    }

    /** Удаляет запись по указанному индексу.
     *
     * @param index
     * индекс элемента массива удаляемой записи
     */
    public void removeNote(int index) {
        if (!isCorrectIndex(index))  {
            System.out.println("Некорректный индекс");
            return;
        }
        notes[index] = null;

    }

    /** Редактирует запись по указанному индексу.
     *
     * Перезаписывает запись по указанному индексу
     * @param index
     * Индекс записи
     * @param newText
     * Новый текст записи
     */
    @SuppressWarnings("unused")
    public void editNote(int index, String newText) {
        if (!isCorrectIndex(index))  {
            System.out.println("Некорректный индекс");
            return;
        }
        notes[index].setTextOfNote(newText);
    }

    /** Выводит на экран все записи.
     *
     */
    public void showAllNotes() {
        for (int i = 0; i < notepadSize; i++) {
            if (notes[i] == null) continue;
            System.out.println(notes[i].getTextOfNote());
        }
    }
    private boolean isCorrectIndex(int index){
        if ((index<0)||(index >= notepadSize)) return false;
        else return true;
    }
}