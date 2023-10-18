package patterns_HW.facade;

import patterns_HW.facade.hardSystem.HardSystem;
import patterns_HW.facade.hardSystem.HardSystemFasade;

public class Main {
    public static void main(String[] args) {
        HardSystem hardSystem = new HardSystem();
        HardSystemFasade hardSystemFasade = new HardSystemFasade();
        hardSystemFasade.fasadeMethod1(hardSystem);
        // клиент имеет доступ только к тем методам и в той форме которые прописаны в фасаде. доступа на прямую к методам в системе нет

    }
}
