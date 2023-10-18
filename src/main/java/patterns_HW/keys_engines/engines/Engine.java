package patterns_HW.keys_engines.engines;

public abstract class Engine {
    int engineType;
    protected abstract void start();

    public int getEngineType() {
        return engineType;
    }
}
