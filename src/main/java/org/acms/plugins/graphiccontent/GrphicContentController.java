package org.acms.plugins.graphiccontent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin/grphic_content")
public class GrphicContentController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "testing";
	}
}
