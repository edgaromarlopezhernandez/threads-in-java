package com.demo.threads.util;

import com.demo.threads.services.MyOtherThing;
import com.demo.threads.services.MyThing;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomCLR implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("Threads app");

        log.info("Extending Thread Class");
        for(int i = 0; i < 3; i ++) {
            MyThing myThing = new MyThing();
            myThing.start();

        }
        log.info("****************");

        log.info("Implementing Runnable interface");
        for(int i = 0; i < 4; i ++) {
            MyOtherThing myOtherThing = new MyOtherThing();
            //Thread thread = new Thread(myOtherThing);
            Thread thread = new Thread(MyOtherThing::new);
            //Thread thread = new Thread(() -> new MyOtherThing());
            thread.start();

        }
        log.info("+++++++++++++++++");
    }
}
