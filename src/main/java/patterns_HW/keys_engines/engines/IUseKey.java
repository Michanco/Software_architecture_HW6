package patterns_HW.keys_engines.engines;

public interface IUseKey {
    /**
     * Запуск метода start для engine при совпадении типов
     * @param engine который будем пытаться завести
     *
     */
    void useKey(Engine engine
    );
}
