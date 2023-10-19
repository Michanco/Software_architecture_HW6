package patterns_HW.keys_engines.keys;

//ключ с фиксированным типом
public class Key1 extends Key implements IGetKeyType{
    private int keyType = 1;

    @Override
    public int getKeyType() {
        return this.keyType;
    }
}
