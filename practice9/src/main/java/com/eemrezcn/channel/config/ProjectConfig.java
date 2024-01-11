package com.eemrezcn.channel.config;

import com.eemrezcn.channel.beans.Person;
import com.eemrezcn.channel.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    /*Here in the below code, we are trying to wire or establish a relationship between Person and
    Vehicle, by invoking the vehicle() bean method from person() bean method. Spring will make sure to have only 1 vehicle bean is
    created and also vehicle bean will be created first always as person bean has dependency on it.*/
    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle());
        return person;
    }

}