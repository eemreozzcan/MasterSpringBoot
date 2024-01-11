package com.eemrezcn.channel.config;

import com.eemrezcn.channel.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*Spring @Configuration annotation, Spring Core çerçevesinin bir parçasıdır. Bu anotasyon, sınıfın @Bean tanımlama yöntemlerini içerdiğini belirtir.
 Böylece, Spring konteyneri sınıfı işleyebilir ve uygulamada kullanılmak üzere Spring Bean'leri oluşturabilir.*/
@Configuration
public class ProjectConfig
{
/*@Bean anotasyon,Spring'in bağlamını başlattığında bu yöntemi çağırması gerektiğini bilmesini ve döndürülen değeri bağlama eklemesini sağlar*/
@Bean(name="audiVehicle")
Vehicle vehicle1() {
    var veh = new Vehicle();
    veh.setName("Audi");
    return veh;
}

    @Bean(value="hondaVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

}
