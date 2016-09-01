public class Outer1 {
    private String str;
    private Date date;
    private Inner inner;
    Outer1() {
        inner=new Inner();
    }
    class Inner {
        public void method() {...}

    }
}

//Пример создания класса
Outer.Inner1 obj1 = new Outer1().new Inner();
obj.print();
//---

//--Доступ к внешнему полю

Outer8.this.count;

//--

//--пример анонимного класса

        Date d=new Date(){
            @Override
            public String toString(){
            return "new version toString method"
            }
        }
//---Дефолтовая реализация

public interface Country {
    String getName();
    default String getCode() {
        String name = getName();
        return name.substring(0,2).toUpperCase();
    }
}

//--Лямбда

Runnable noArguments = () -> System.out.println("Hello world");
/* можно записать лямбду без аргументов

 */
ActionListener oneArgument = event -> System.out.println("blablabla");
//Если несколько операторов:
    ActionListener oneArgument = event -> {
    System.out.println("blablabla");
    System.out.println("blablabla");
    System.out.println("blablabla");
}

// Форма ещё записи
// Все аргументы передаются сразу в функцию
final Runable runable1=Date::new
      // равносильно:
final Runable getRunable1 = () -> new Date();