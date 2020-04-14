package com.kpra.doc.app.track.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeepAliveController {
	
	@GetMapping("/keepalive")
	public String getApplicationStatus() {
		return "Doc tracking and approval system is up and running";
	}

}
