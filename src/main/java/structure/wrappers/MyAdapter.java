package structure.wrappers;

public class MyAdapter {
    private Printer printer;

    public MyAdapter(Printer printer) {
        this.printer = printer;
    }

    public void printThis(Phrase phrase) {
        System.out.println("\n\nAdapter");
        printer.printThis(phrase.getLine());
    }
}
