package Lesson_5;

public class Arr {
    protected static final int size = 1000000;
    protected static final int h = size / 2;
    protected float[] arr = new float[size];
    protected float[] a1 = new float[h];
    protected float[] a2 = new float[h];


    public void getArr1() {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(1);
        }
    }

    public void getArr1Part2() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public void getArr2() {
        Thread t1 = new Thread(() -> {
            System.arraycopy(arr, 0, a1, 0, h);
            System.arraycopy(arr, h, a2, 0, h);
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getArr2Part2() {

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                System.out.print(1);
            }
            for (int i = 0; i < a2.length; i++) {
                System.out.print(1);
            }
        });
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getArr2Part3() {
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (arr[i] * Math.sin(0.2f + (i + h) / 5) * Math.cos(0.2f + (i + h) / 5) * Math.cos(0.4f + (i + h) / 2));
            }
        });
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getArr2Part4() {
        Thread t4 = new Thread(() -> {
            System.arraycopy(a1, 0, arr, 0, h);
            System.arraycopy(a2, 0, arr, h, h);
        });
        t4.start();
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
