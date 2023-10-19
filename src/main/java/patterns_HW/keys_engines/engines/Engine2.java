package patterns_HW.keys_engines.engines;

public class Engine2 extends Engine{
    private int engineType = 2;
    @Override
    protected void start() {
        System.out.println("Engine2 started");
    }

    @Override
    public void useKey(Key key) {
        if (this.engineType == key.getKeyType()){
            this.start();
        } else {
            System.out.println("The key is wrong");
        }

    }


}
