package com.telefeed;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component("telefeedBot")
public class TelefeedBot extends TelegramWebhookBot {

    @Value("${telegrambot.userName}")
    private String botUsername;
    @Value("${telegrambot.botToken}")
    private String botToken;
    @Value("${telegrambot.webHookPath}")
    private String webHookPath;

//    @Autowired
//    public TelefeedBot(BotConfig options) {
//        super(options);
//    }

    @Override
    public BotApiMethod onWebhookUpdateReceived(Update update) {
        if (update.getMessage() != null && update.getMessage().hasText()) {
            long chat_id = update.getMessage().getChatId();

            try {
                execute(new SendMessage(chat_id, "Hi" + update.getMessage().getText()));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    @Override
    public String getBotUsername() {
        return botUsername;
    }
    @Override
    public String getBotToken() {
        return botToken;
    }
    @Override
    public String getBotPath() {
        return webHookPath;
    }
}