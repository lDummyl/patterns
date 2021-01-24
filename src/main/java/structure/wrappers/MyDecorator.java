package structure.wrappers;

public class MyDecorator implements Printer {

    Printer wrapMe;

    public MyDecorator(Printer wrapMe) {
        this.wrapMe = wrapMe;
    }


    public void printThis(String lineToPrint) {
        wrapMe.printThis(lineToPrint);
    }

    public void printThis(String lineToPrint, int nTimes) {
        for (int i = 0; i < nTimes; i++) {
            wrapMe.printThis(lineToPrint);
        }
    }
}
