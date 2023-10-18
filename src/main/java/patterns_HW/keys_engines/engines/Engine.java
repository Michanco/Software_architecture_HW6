package patterns_HW.keys_engines.engines;

public abstract class Engine {
    int engineType;
    //доступ к методу только через подходящий ключ
    protected abstract void start();

    public int getEngineType() {
        return engineType;
    }
}
