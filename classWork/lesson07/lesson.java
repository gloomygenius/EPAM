//------Параметрические классы
//Пример шаблона с двумя параметрами:
public class Message<T1, T2> {
    T1 id;
    T2 name;
}
    //    ещё пример:
    Massage<Integer, String> ob = new Message<integer, String>();
    //        с седьмой джавы:
    Massage<Integer, String> ob = new Message<>();

//        ещё пример:
public class Optional<T> {
    private T value;

    public Optional() {
    }

    public }