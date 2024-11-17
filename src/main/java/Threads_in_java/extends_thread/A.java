package Threads_in_java.extends_thread;

import javax.imageio.stream.ImageInputStream;

public class A extends Thread{
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Run");
        }
    }

    public static void main(String[] args) {
        A a1=new A();
        a1.start();
        for(int i=0; i<5; i++){
            System.out.println("main");
        }
    }
}
