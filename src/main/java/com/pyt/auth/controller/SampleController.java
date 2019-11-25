package com.pyt.auth.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/user")
public class SampleController {
@GetMapping("/all")
public String hello() {
	return "hello user";
}
@PreAuthorize("hasAnyRole('admin')")
@GetMapping("/secured/all")
public String securedHello() {
	return "secured hello";
}
}
