package patterns_HW.keys_engines;

import patterns_HW.keys_engines.engines.*;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine1();
        Engine engine2 = new Engine2();
        Key1 key1 = new Key1();
        Key2 key2 = new Key2();
        key1.useKey(engine1);
        key2.useKey(engine2);
        ProgrammedKey programmedKey = new ProgrammedKey();
        programmedKey.useKey(engine1);
        programmedKey.setKeyType(1);
        programmedKey.useKey(engine1);
        programmedKey.useKey(engine2);
        programmedKey.setKeyType(2);
        programmedKey.useKey(engine2);


    }
}
