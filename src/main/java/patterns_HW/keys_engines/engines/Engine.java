package patterns_HW.keys_engines.engines;

public abstract class Engine {
    int engineType;
    //доступ к методу только через подходящий ключ
    abstract  void start();
    abstract public void useKey(Key key);
}
