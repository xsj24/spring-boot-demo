package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}
	
	// 本地的静态资源都配置在了classpath下
	@RequestMapping(value="hello", method=RequestMethod.GET, params="foo")
	public String hello(String foo) {
		System.out.println(foo);
		return "test.html";
	}
	
}
