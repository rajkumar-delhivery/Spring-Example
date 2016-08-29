package com.r.scheduleTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by delhivery on 26/8/16.
 */

@Component
public class ScheduleTasks {
     private static final Logger log = LoggerFactory.getLogger(ScheduleTasks.class);
     private static final SimpleDateFormat date_format = new SimpleDateFormat("HH:mm:ss");// Print time on console in "HH:mm:ss" format

    //function is called iteratively after each 5 second
    @Scheduled(fixedRate = 5000)
     public void reportCurrentTime(){
        log.info("The time is now {}", date_format.format(new Date()));
    }
}
