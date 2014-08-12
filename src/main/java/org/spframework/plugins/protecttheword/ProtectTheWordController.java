package org.spframework.plugins.protecttheword;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/protect-the-word")
public class ProtectTheWordController {

	@RequestMapping("/update-words-library")
	@ResponseBody
	public String UpdateWordsLibrary() {
		return "testing";
	}
}
