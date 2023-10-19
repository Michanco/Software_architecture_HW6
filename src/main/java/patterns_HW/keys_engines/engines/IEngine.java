package patterns_HW.keys_engines.engines;

public interface IEngine {
    //доступ к методу только через подходящий ключ
    private void start(){};
    void useKey(Key key);
    int getEngineType();
}
