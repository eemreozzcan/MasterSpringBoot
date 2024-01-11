package com.eemrezcn.channel.config;

import com.eemrezcn.channel.beans.Fruit;
import com.eemrezcn.channel.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*Spring @Configuration annotation, Spring Core çerçevesinin bir parçasıdır. Bu anotasyon, sınıfın @Bean tanımlama yöntemlerini içerdiğini belirtir.
 Böylece, Spring konteyneri sınıfı işleyebilir ve uygulamada kullanılmak üzere Spring Bean'leri oluşturabilir.*/
@Configuration
public class ProjectConfig
{
/*@Bean anotasyon,Spring'in bağlamını başlattığında bu yöntemi çağırması gerektiğini bilmesini ve döndürülen değeri bağlama eklemesini sağlar*/
    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    String hello() {
        return "Hello World";
    }


    @Bean
    Integer number() {
        return 16;
    }

    @Bean
    Fruit fruit() {
    var fruit = new Fruit();
    fruit.setName("Apple");
    fruit.setColor("Red");
    return fruit;
    }

}
