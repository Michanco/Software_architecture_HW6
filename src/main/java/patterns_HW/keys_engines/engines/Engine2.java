package patterns_HW.keys_engines.engines;

import patterns_HW.keys_engines.keys.Key;

public class Engine2 implements IEngine {
    private int engineType = 2;
    private void start() {
        System.out.println("Engine2 started");
    }

    @Override
    public void useKey(Key key) {
        if (engineType == key.getKeyType()) {
            this.start();
        } else {
            System.out.println("The key is wrong");
        }
    }
    @Override
    public int getEngineType() {
        return engineType;
    }
}
