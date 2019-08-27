package net.shopec.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主页
 *
 */
@RestController
public class IndexController {

	 @RequestMapping("/")
	public String index() {
		return "Hello SHOPEC!";
	}
}
