package com.telefeed.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;

/**
 * @author Ruslan Idrisov
 */
@Configuration("botConfig")
public class BotConfig extends DefaultBotOptions {

    @Value("${telegrambot.proxyType}")
    private DefaultBotOptions.ProxyType proxyType;
    @Value("${telegrambot.proxyHost}")
    private String proxyHost;
    @Value("${telegrambot.proxyPort}")
    private int proxyPort;
    @Value("${telegrambot.proxyEnable}")
    private Boolean proxyEnable;

    @Override
    public ProxyType getProxyType() {
        if (proxyEnable) {
            return proxyType;
        } else {
            return ProxyType.NO_PROXY;
        }
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