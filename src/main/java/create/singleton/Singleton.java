package create.singleton;

/*
Задание
Реализовать еще 2 любых примера реализации.
Доп: Симитировать сценарий при котором в многопоточной среде
не синхронизированный сингольтон создаст 2 объекта.

 */

public class Singleton {
    private static Singleton instance;
    private Singleton () {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}