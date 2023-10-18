package patterns_HW.keys_engines.engines;

public class Key2 implements IUseKey{
    private int keyType = 2;

    public void useKey(Engine engine){
        if (this.keyType == engine.getEngineType()){
            engine.start();
        } else {
            System.out.println("The key is wrong");
        }

    }
}
