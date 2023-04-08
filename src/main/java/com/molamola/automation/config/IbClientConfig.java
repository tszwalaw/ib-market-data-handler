package com.molamola.automation.config;

import com.molamola.automation.helper.IBHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

@Configuration
public class IbClientConfig {
    @Value("${ib.server.host}")
    private String host;

    @Value("${ib.server.port}")
    private int port;

    @Bean
    public com.molamola.automation.helper.IBHelper iBHelper() throws IOException {
        return new IBHelper(host, port);
    }

}
