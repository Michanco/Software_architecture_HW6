package patterns_HW.facade.hardSystem;
// фасад даёт клиенту ограниченный или упрощённый доступ к функционалу сложной системы.
public class HardSystemFasade implements IHardSystemFasade{
    @Override
    public void fasadeMethod1(HardSystem hardSystem) {
        hardSystem.method1();
        hardSystem.method23();
    }

    @Override
    public void fasadeMethod2(HardSystem hardSystem) {
        hardSystem.method2();
    }
}
