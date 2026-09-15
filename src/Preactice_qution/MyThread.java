package Preactice_qution;

public class MyThread extends Thread{
    private String name;
    MyThread(String name)
    {
        this.name=name;
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(name+" : "+i);
        }
}

    public static void main(String[] args) {
        MyThread t1=new MyThread("t1");
        MyThread t2=new MyThread("t2");
        t1.start();
        t2.start();
    }
}
