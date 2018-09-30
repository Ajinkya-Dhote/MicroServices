package in.ajinkyadhote.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileContoller {

	@GetMapping(value="/getall")
	public String getAllFiles() {
		return "hello";
	}
}
