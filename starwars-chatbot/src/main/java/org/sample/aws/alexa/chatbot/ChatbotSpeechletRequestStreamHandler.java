package org.sample.aws.alexa.chatbot;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

/**
 * This class is the handler for AWS Lambda function.
 *
 * @author Arun Gupta
 */
public class ChatbotSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final Set<String> SUPPORTED_APPLICATION_IDS = new HashSet<String>();
    static {
        SUPPORTED_APPLICATION_IDS.add("amzn1.ask.skill.eaed0f8b-5003-4e3e-87b2-bf1fe927ae99");
    }

    public ChatbotSpeechletRequestStreamHandler() {
        super(new ChatbotSpeechlet(), SUPPORTED_APPLICATION_IDS);
    }    
}
