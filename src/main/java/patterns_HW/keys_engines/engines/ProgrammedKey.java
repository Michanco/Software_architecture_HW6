package patterns_HW.keys_engines.engines;

// ключ с возможностью изменения типа
public class ProgrammedKey implements IUseKey{
    private int keyType;
    @Override
    public void useKey(Engine engine) {
        if (this.keyType == engine.getEngineType()){
            engine.start();
        } else {
            System.out.println("The key is wrong");
        }
    }
    public void setKeyType(int keyType) {
        this.keyType = keyType;
    }
}
