package class_and_obj;

import class_and_obj.StopWatch;

import java.util.Date;

public class TestWatch {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) Math.floor(Math.random()*10000);
        }

        StopWatch obj = new StopWatch();
        obj.start();
        sort(arr);
        obj.stop();
        Date a = new Date();
        System.out.printf("%s\n",a);
        System.out.printf("%d,%d,%d",obj.getElapsedTime(),obj.getStartTime(),obj.getEndTime());
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
