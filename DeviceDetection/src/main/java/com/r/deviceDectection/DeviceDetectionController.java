package com.r.deviceDectection;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by delhivery on 26/8/16.
 * Programm to determine the type of the device on which the app is running.
 */
@Controller
public class DeviceDetectionController {

    // method to determine the type of device (mobile , tablet or normal browser)
    @RequestMapping("/device-Identification")
    public @ResponseBody String detectDevice(Device device){
        String deviceName = "No-Idea";

        if(device.isNormal()){
            deviceName = "Normal";
        }
        else if(device.isMobile()){
            deviceName = "Mobile";
        }
        else if(device.isTablet()){
            deviceName = "Tablet";
        }

        return "Hello "+deviceName+" browser !";
    }
}

