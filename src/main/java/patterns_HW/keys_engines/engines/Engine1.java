package patterns_HW.keys_engines.engines;

public class Engine1 implements Engine{
    private int engineType = 1;
    private void start() {
        System.out.println("Engine1 started");
    }

    @Override
    public void useKey(Key key) {
        if (engineType == key.getKeyType()) {
            this.start();
        } else {
            System.out.println("The key is wrong");
        }
    }

    @Override
    public int getEngineType()  {
        return engineType;
    }

}
