package com.usm.example;

import com.usm.example.model.Aquarium;
import com.usm.example.model.Dweller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.List;

@Configuration
@ComponentScan("com.usm.example.model")
@PropertySource("classpath:application.properties")
public class SpringConfiguration {

    @Bean(name = "valera")
    public Dweller dweller() {
        return new Dweller(12, "Valera");
    }

    @Bean
    public Dweller defaultDweller() {
        return new Dweller();
    }

    @Bean
    @Autowired
    public Aquarium aquarium(final List<Dweller> dwellers) {
        final Aquarium aquarium = new Aquarium(1, 2, 3);
        aquarium.setDwellers(dwellers);
        return aquarium;
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
