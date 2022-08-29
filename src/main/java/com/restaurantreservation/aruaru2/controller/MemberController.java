package com.restaurantreservation.aruaru2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	@GetMapping("join")
	public String join() {
		return "join";
	}
}
