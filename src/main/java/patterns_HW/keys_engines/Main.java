package patterns_HW.keys_engines;

import patterns_HW.keys_engines.engines.*;
import patterns_HW.keys_engines.keys.Key;
import patterns_HW.keys_engines.keys.Key1;
import patterns_HW.keys_engines.keys.Key2;
import patterns_HW.keys_engines.keys.ProgrammedKey;

public class Main {
    public static void main(String[] args) {
        IEngine engine1 = new Engine1();
        IEngine engine2 = new Engine2();
        Key key1 = new Key1();
        Key key2 = new Key2();
        engine1.useKey(key1);
        engine2.useKey(key2);
        ProgrammedKey programmedKey = new ProgrammedKey();
        engine1.useKey(programmedKey);
        programmedKey.setKeyType(1);
        engine1.useKey(programmedKey);
        programmedKey.setKeyType(2);
        engine2.useKey(programmedKey);



    }
}
