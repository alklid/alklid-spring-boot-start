package me.alklid;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Holoman holoman(HolomanProperties prop) {
        Holoman holoman = new Holoman();
        holoman.setHowLong(prop.getHowLong());
        holoman.setName(prop.getName()) ;

        return holoman;
    }
}
