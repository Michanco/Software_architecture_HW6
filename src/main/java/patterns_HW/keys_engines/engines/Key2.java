package patterns_HW.keys_engines.engines;

public class Key2 extends Key implements IGetKeyType{
    private int keyType = 2;

    @Override
    public int getKeyType() {
        return this.keyType;
    }
}
