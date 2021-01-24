package structure.wrappers;

import java.time.Duration;
import java.time.LocalDateTime;

public class MyProxy implements Printer {
    private Printer printer;

    public MyProxy(Printer printer) {
        this.printer = printer;
    }

    public void printThis(String lineToPrint) {
        LocalDateTime before = LocalDateTime.now();
        System.out.println("\n\nStart Proxy");
        printer.printThis(lineToPrint);
        System.out.printf("printing done (time: %s)\n", Duration.between(before, LocalDateTime.now()).toMillis());
    }
}
