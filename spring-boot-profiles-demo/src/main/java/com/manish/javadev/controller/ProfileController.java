package com.manish.javadev.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testprofiles")
public class ProfileController {

	@Value(value = "${message.activeprofiles}")
	private String testActiveProfiles;

	@GetMapping("/profile")
	public String testActiveProfile() {
		return testActiveProfiles;
	}
}