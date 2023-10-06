package org.amazon;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        while (true){
            System.out.println("please enter your name ");
            executorService.submit(new Runnable() {
                @Override
                public void run() {
//                    System.out.println("enter your name is "+scanner.nextLine()+" current thread name :"+Thread.currentThread().getName());
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

        }


















    }
}
