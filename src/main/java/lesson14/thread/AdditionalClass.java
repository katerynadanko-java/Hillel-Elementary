package lesson14.thread;

import lombok.Data;

@Data
public class AdditionalClass {
    private static Integer CLASS_ID = 0;

    public static void runAdditional() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", CLASS_ID: " + CLASS_ID++);

    }
}
