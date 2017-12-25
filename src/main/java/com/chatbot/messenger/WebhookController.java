package com.chatbot.messenger;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {
	
	@RequestMapping(value="/greeting/get", method=RequestMethod.GET)
	public Greeting sendMessage(@RequestParam(value="name",defaultValue="World") String name) {
		return new Greeting(15, "hello" + name);
	}
	
	@RequestMapping(value="/greeting/post", method=RequestMethod.POST)
	public void getMessage(@RequestParam(value="name",defaultValue="World") String name) {
		
	}


}
