package com.eemrezcn.channel.main;

import com.eemrezcn.channel.beans.Vehicle;
import com.eemrezcn.channel.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Practice2
{
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.eemrezcn.channel.beans.Vehicle' available: expected single matching bean but found 3: vehicle,vehicle2,vehicle3
        //Sadece Vehicle olarak tanımlama yapılırsa hata alınıyor
        // Vehicle veh = context.getBean(Vehicle.class);
        //NoUniqueBeanDefinitionException hatası alınmaması için bean isimleri ile çağırma yapılıyor
        Vehicle veh = context.getBean("vehicle1",Vehicle.class); //Config sınıfında tanımlanan bean ismi ile çağırılıyor
        System.out.println("Vehicle name from Spring Context is: " + veh.getName()); //Audi 8

    }
}
