package structure.wrappers;

public class Extender extends ExtendMe {

    @Override
    public void overrideMe() {
        System.out.println("Begin");
        super.overrideMe();
        System.out.println("End");
    }
}
