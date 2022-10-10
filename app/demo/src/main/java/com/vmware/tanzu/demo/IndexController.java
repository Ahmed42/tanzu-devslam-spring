package com.vmware.tanzu.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class IndexController {
	@GetMapping("/")
	String index() {
		return "Hellos!";
	}
}