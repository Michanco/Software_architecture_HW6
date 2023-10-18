package patterns_HW.keys_engines.engines;

//ключ с фиксированным типом
public class Key1 implements IUseKey{
    private int keyType = 1;


    @Override
    public void useKey(Engine engine){
        if (this.keyType == engine.getEngineType()){
            engine.start();
        } else {
            System.out.println("The key is wrong");
        }

    }
}
