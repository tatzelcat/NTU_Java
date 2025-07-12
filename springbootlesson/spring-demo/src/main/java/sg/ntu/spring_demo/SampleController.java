package sg.ntu.spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String hello(){
	    return "Hello World!";
    }

    @GetMapping("/greet")
    public String greet(
	    @RequestParam(defaultValue = "World") String name, 
	    @RequestParam(defaultValue = "unknown") String role
	    ) {
	    return "Hello " + name + "! Your job is " + role + "!";
    }

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable int id) {
	    return "User ID: " + id;
    }

    //App Info Endpoints

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String port;

    @GetMapping("/app-info")
    public String getAppInfo(){
        return "App " + appName + " is running on port: " + port;
    }

    
    //Sample Item Endpoints

    @Autowired
    private SampleItem item;
    
    @GetMapping("/item")
    public SampleItem getItem(){
        item.setID(1);
        item.setName("Apple");
        item.setPrice(1.99);
        item.setDesc("A Red Delicious Apple");

        return item;
    }

}



