package com.mehdi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// Ra a partir dial had lconf kancreyiw l container.
// had lconf hiya li kat9lb 3la les component.

@Configuration
@ComponentScan
public class AppConfig {
    // when the bean will be created the callback method will be called
    @Bean("Mehdi")
    public Player player1 (){ return new Player();}

    @Bean("Younes")
    public Player player2 (){ return new Player();}

}
