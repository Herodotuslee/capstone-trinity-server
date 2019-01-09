package com.capstone.demo.services;

import com.capstone.demo.domain.Backlog;
import com.capstone.demo.domain.Project;

import com.capstone.demo.domain.Schedule;
import com.capstone.demo.repositories.BacklogRepository;
import com.capstone.demo.repositories.ProjectRepository;
import com.capstone.demo.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;


    public Schedule updateSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);


    }

    public void deleteSchedule(Long schedule_id){
        scheduleRepository.deleteById(schedule_id);
    }

    public Iterable<Schedule> findAllSchedules(){
        return scheduleRepository.findAll();
    }
}