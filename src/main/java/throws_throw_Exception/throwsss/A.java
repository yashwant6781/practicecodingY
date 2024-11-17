package throws_throw_Exception.throwsss;

import java.io.FileWriter;
import java.sql.SQLOutput;

public class A {
    public static void main(String[] args) throws Exception{
        A a1=new A();
        a1.test();

    }
    public void test()throws Exception{
        FileWriter fw = new FileWriter("D://test_yaswhant.txt");
        System.out.println("Created");

    }
}

