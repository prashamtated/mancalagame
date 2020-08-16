/**
 * 
 */
package com.prasham.mancala.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.prasham.mancala.dto.Message;

/**
 * @author PRASHAMT 
 * Aug 16, 2020
 */

@Controller
public class ChatController {

	/**
	 * This method use for sending message.
	 * 
	 * @param message
	 * @return message containt
	 * @throws Exception
	 */
	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public Message sendMessage(Message message) throws Exception {
		Thread.sleep(1000); // simulated delay
		return new Message(message.getContent());
	}

}