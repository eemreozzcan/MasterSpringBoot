package com.eemrezcn.channel.main;

import com.eemrezcn.channel.beans.Vehicle;
import com.eemrezcn.channel.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Practice4
{
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from Spring Context is: " + vehicle.getName());

    }
}
