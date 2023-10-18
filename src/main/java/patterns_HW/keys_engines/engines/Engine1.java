package patterns_HW.keys_engines.engines;

public class Engine1 extends Engine{
    private int engineType = 1;
    @Override
    protected void start() {
        System.out.println("Engine1 started");
    }

    public int getEngineType() {
        return engineType;
    }
}
