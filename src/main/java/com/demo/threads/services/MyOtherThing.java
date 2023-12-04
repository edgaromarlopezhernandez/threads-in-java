package com.demo.threads.services;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyOtherThing implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i ++) {
            log.info("My other heavy work with id: " + i + " in thread : " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
