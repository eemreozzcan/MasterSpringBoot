package com.eemrezcn.channel.main;

import com.eemrezcn.channel.beans.Vehicle;
import com.eemrezcn.channel.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Practice3
{
    public static void main(String[] args) {

        // AnnotationConfigApplicationContext, Spring uygulamanın ana bağlamını oluşturur.
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // "audiVehicle" adlı Spring Bean'ini alır ve "veh1" değişkenine atar.
        Vehicle veh1 = context.getBean("audiVehicle",Vehicle.class);
        // "veh1" nesnesinin adını yazdırır.
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());

        // Benzer şekilde "hondaVehicle" adlı Spring Bean'ini alır ve "veh2" değişkenine atar.
        Vehicle veh2 = context.getBean("hondaVehicle",Vehicle.class);
        // "veh2" nesnesinin adını yazdırır.
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());

        // Son olarak "ferrariVehicle" adlı Spring Bean'ini alır ve "veh3" değişkenine atar.
        Vehicle veh3 = context.getBean("ferrariVehicle",Vehicle.class);
        // "veh3" nesnesinin adını yazdırır.
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());
    }
}
