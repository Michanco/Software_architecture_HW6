package patterns_HW.keys_engines.engines;

public class Engine1 extends Engine{
    private int engineType = 1;
    @Override
    protected void start() {
        System.out.println("Engine1 started");
    }

    @Override
    public void useKey(Key key) {
        if (this.engineType == key.getKeyType()){
            this.start();
        } else {
            System.out.println("The key is wrong");
        }

    }


    public int getEngineType() {
        return engineType;
    }
}
