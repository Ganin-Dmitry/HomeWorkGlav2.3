public interface MotorTransport {
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
