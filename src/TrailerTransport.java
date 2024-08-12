public interface TrailerTransport {
    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
