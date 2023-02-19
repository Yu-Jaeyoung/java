package java_2023.ch12;

public class ThreadB extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run() {
        while (stop) {
            if (work) {
                System.out.println("ThreadB1 작업 내용");
            } else { // work가 false가 되면 다른 스레드에게 실행 양보
                Thread.yield();
            }
        }
        System.out.println("ThreadB 종료");
    }
}