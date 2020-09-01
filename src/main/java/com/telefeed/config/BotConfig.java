package com.telefeed.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;


@Getter
@Setter
@Configuration("botConfig")
public class BotConfig extends DefaultBotOptions {

    @Value("${telegrambot.proxyType}")
    private DefaultBotOptions.ProxyType proxyType;
    @Value("${telegrambot.proxyHost}")
    private String proxyHost;
    @Value("${telegrambot.proxyPort}")
    private int proxyPort;

    @Override
    public ProxyType getProxyType() {
        return proxyType;
    }

    @Override
    public String getProxyHost() {
        return proxyHost;
    }

    @Override
    public int getProxyPort() {
        return proxyPort;
    }
}