package util;

/**
 * @Author yexun
 * @Date 2019-09-15
 */
public class DateUtils {

    public static long executionTime(Actuator actuator) {
        long begin = System.currentTimeMillis();
        actuator.execute();
        System.out.println(System.currentTimeMillis() - begin + "ms");
        return System.currentTimeMillis() - begin;
    }

    @FunctionalInterface
    public interface Actuator {

        void execute();

    }
}
