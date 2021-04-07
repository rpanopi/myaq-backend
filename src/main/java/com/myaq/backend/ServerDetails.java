package com.myaq.backend;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class ServerDetails {

    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate date;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime time;

    private String zoneName;

    public ServerDetails(ZonedDateTime zdt) {
        this.date = zdt.toLocalDate();
        this.time = zdt.toLocalTime();
        this.zoneName = zdt.getZone().toString();
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getZoneName() {
        return zoneName;
    }
}
