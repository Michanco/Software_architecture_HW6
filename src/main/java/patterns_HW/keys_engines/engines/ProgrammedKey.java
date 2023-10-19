package patterns_HW.keys_engines.engines;

// ключ с возможностью изменения типа
public class ProgrammedKey extends Key implements IGetKeyType{
    private int keyType = 0;
    public void setKeyType(int keyType) {
        this.keyType = keyType;
    }
    @Override
    public int getKeyType() {
        return this.keyType;
    }
}
