/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messageList;

    public MessagingService() {
        this.messageList = new ArrayList<>();
    }

    public void add(Message message) {
        if (message == null) {
            return;
        }
        String content = message.getContent();
        if (content.length() > 280) {
            return;
        }
        messageList.add(message);
    }

    public ArrayList<Message> getMessages() {
        ArrayList<Message> newMessage = new ArrayList<>(this.messageList);
        return newMessage;
    }

}
