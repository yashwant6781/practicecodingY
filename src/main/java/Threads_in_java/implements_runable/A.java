package Threads_in_java.implements_runable;

import javax.imageio.stream.ImageInputStream;

public class A implements Runnable{
    String name;
    A(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(this.name);
        }
    }

    public static void main(String[] args) {
        A a1=new A("xxxx");
        Thread t1=new Thread(a1);
        t1.start();
        A a2=new A("yyyy");
        Thread t2=new Thread(a2);
        t2.start();
        for(int i=0; i<10; i++){
            System.out.println("Main");
        }
    }
}

