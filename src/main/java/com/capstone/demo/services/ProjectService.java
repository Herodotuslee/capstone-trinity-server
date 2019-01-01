package com.capstone.demo.services;

import com.capstone.demo.domain.Project;
import com.capstone.demo.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    public Iterable<Project> findAllProjects(){
        return projectRepository.findAll();
    }

    public Project saveOrUpdateProject(Project project){
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);

    }

    public Project findProjectByIdentifier(String projectId){

        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
        return project;
    }

    public void deleteProjectByIdentifier(String projectid){
        Project project = projectRepository.findByProjectIdentifier(projectid.toUpperCase());
        projectRepository.delete(project);
    }



}