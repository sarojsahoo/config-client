package com.configclient.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MainController {

   // @Autowired
    //private Environment env;

    @Value("${my.gretting}")
    private String grettingValue;

    @GetMapping("/get-details")
    public String getDetailss () {

        return grettingValue;
    }
}
