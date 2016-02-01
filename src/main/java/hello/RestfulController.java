package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

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
}
