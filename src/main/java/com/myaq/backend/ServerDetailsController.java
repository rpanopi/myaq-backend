package com.myaq.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@RestController
public class ServerDetailsController {

    @CrossOrigin
    @GetMapping("/serverDetails")
    public ServerDetails serverDetails() {
        ZonedDateTime now = ZonedDateTime.now();
        return new ServerDetails(now);
    }
}
