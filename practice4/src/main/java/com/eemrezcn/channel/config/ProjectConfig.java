package com.eemrezcn.channel.config;

import com.eemrezcn.channel.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// @Configuration anotasyonu, sınıfın Spring Bean'lerini tanımladığını belirtir.
@Configuration
public class ProjectConfig {

    // @Bean anotasyonu, Spring'in bağlamını başlattığında bu yöntemi çağırması gerektiğini ve döndürülen değeri bir Spring Bean'i olarak bağlama eklemesini sağlar.
    @Bean(name="audiVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    // Bu yöntem de bir Spring Bean oluşturur, ancak bu sefer ismi "hondaVehicle" olan bir Araba nesnesi oluşturur.
    @Bean(value="hondaVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    // @Primary anotasyonu, birden fazla uyumlu bean olduğunda hangisinin öncelikli olduğunu belirtir.
    @Primary
    // Bu yöntem de bir Spring Bean oluşturur, ancak bu sefer ismi "ferrariVehicle" olan bir Araba nesnesi oluşturur.
    @Bean("ferrariVehicle")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

}