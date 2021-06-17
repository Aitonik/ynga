package com.example.ynga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    private Logger logger = LoggerFactory.getLogger(ProfileController.class);


    @PostMapping("")
    public String saveProfile(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String password) {
        logger.info("save profile - " + name);
        return name;
    }

}
