package structure.wrappers;




public class User {

    public static void main(String[] args) {

        Printer wrapMe = new WrapMe();
//      Декоратор предоставляет расширенный интерфейс.
        MyDecorator doStuff = new MyDecorator(wrapMe);
        onlyWithPrinter(doStuff);
        doStuff.printThis("Do stuff!", 10);

//      Адаптер предоставляет классу альтернативный интерфейс.
        MyAdapter myAdapter = new MyAdapter(wrapMe);
        Phrase phrase = new Phrase("Do stuff!");
        myAdapter.printThis(phrase);

//      Заместитель предоставляет тот же интерфейс.
        Printer myProxy = new MyProxy(wrapMe);
        onlyWithPrinter(myProxy);

    }

    private static void onlyWithPrinter(Printer doStuff) {
        doStuff.printThis("Do stuff!");
    }
}
