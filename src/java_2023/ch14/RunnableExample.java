package java_2023.ch14;

public class RunnableExample {
    public static void main(String[] args) {
        /*
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        */
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

        thread.start();
    }
}
