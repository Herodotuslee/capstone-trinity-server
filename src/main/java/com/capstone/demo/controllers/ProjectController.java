package com.capstone.demo.controllers;


import com.capstone.demo.domain.Project;
import com.capstone.demo.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/project")
@CrossOrigin
public class ProjectController {

    @Autowired
    private ProjectService projectService;


    @PostMapping("")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result){
        if(result.hasErrors()){
            return new ResponseEntity<String>("Invalid Project Object",HttpStatus.BAD_REQUEST);
        }
        Project project1 = projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<Project> getAllProjects(){return projectService.findAllProjects();}



    @GetMapping("/{projectId}")
    public ResponseEntity<?> getProjectById(@PathVariable String projectId){

        Project project = projectService.findProjectByIdentifier(projectId);

        return new ResponseEntity<Project>(project, HttpStatus.OK);
    }


    @DeleteMapping("/{projectId}")
    @CrossOrigin
    public ResponseEntity<?> deleteProject(@PathVariable String projectId){
        projectService.deleteProjectByIdentifier(projectId);
        return new ResponseEntity<String>("Project with ID: '"+projectId+"' was deleted", HttpStatus.OK);
    }
}