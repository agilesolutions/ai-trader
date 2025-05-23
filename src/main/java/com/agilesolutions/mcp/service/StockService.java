package com.agilesolutions.mcp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class StockService {

    private final ChatClient chatClient;


    public void checkStocks(){

    PromptTemplate pt = new PromptTemplate("""
                What’s the current value in dollars of my wallet based on the latest stock daily prices ?
                """);
            Prompt p = pt.create();

            chatClient.prompt(p)
            .call()
                .content();
    }

}

