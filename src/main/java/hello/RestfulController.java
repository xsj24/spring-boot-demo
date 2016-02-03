package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class RestfulController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/greeting")
    public Map greet() {
    	Map<String , Object> map = new HashMap<>();
    	map.put("id", 1);
    	map.put("content", "Hello World!");
    	return map;
    }
    
    @RequestMapping("/wait")
    public Map waiting() {
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	Map<String , Object> map = new HashMap<>();
    	map.put("id", 1);
    	map.put("content", "Hello World!");
    	return map;
    }
    
    @RequestMapping(value="/get", method=RequestMethod.GET)
    public String get(@RequestParam String foo) {
    	return "Obtained 'foo' query parameter value '" + foo + "'";
    }
    
    @RequestMapping(value="/body", method=RequestMethod.POST, produces="text/plain;charset=utf-8")
	public String withBody(@RequestBody String body) {
    	System.out.println(body);
		return "收到数据： '" + body + "'";
	}
}
