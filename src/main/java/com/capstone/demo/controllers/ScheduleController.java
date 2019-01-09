package com.capstone.demo.controllers;


import com.capstone.demo.domain.Schedule;
import com.capstone.demo.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/schedule")
@CrossOrigin
public class  ScheduleController  {


    @Autowired
    private ScheduleService scheduleService;



    @GetMapping("/all")
    public Iterable<Schedule> getAllSchedules(){
        return scheduleService.findAllSchedules();
    }


    @PostMapping("")
    public ResponseEntity<?> createNewSchedule(@Valid @RequestBody Schedule schedule){
        Schedule expense1 =scheduleService.updateSchedule(schedule);
        return new ResponseEntity<Schedule>(expense1, HttpStatus.CREATED);
    }

    @DeleteMapping("/{scheduleId}")
    public ResponseEntity<?> deleteSchedule(@PathVariable Long scheduleId){
        scheduleService.deleteSchedule( scheduleId);
        return new ResponseEntity<String>("Project with ID: '"+scheduleId+"' was deleted", HttpStatus.OK);
    }


}
