package com.capstone.demo.services;

import com.capstone.demo.domain.Backlog;
import com.capstone.demo.domain.Project;
import com.capstone.demo.domain.ProjectTask;
import com.capstone.demo.repositories.BacklogRepository;
import com.capstone.demo.repositories.ProjectRepository;
import com.capstone.demo.repositories.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class ProjectTaskService {


    @Autowired
    private BacklogRepository backlogRepository;

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    @Autowired
    private ProjectRepository projectRepository;


    public ProjectTask addProjectTask(String projectIdentifier, ProjectTask projectTask){

            Backlog backlog = backlogRepository.findByProjectIdentifier(projectIdentifier);
            projectTask.setBacklog(backlog);
            Integer BacklogSequence = backlog.getPTSequence();
            BacklogSequence++;
            backlog.setPTSequence(BacklogSequence);

            projectTask.setProjectSequence(backlog.getProjectIdentifier()+"-"+BacklogSequence);
            projectTask.setProjectIdentifier(projectIdentifier);
            if(projectTask.getStatus()==""|| projectTask.getStatus()==null){
                projectTask.setStatus("TO_DO");
            }

            if(projectTask.getPriority()== null||projectTask.getPriority()==0){
                projectTask.setPriority(3);
            }
            return projectTaskRepository.save(projectTask);
    }

    public Iterable<ProjectTask>findBacklogById(String id){

        Project project = projectRepository.findByProjectIdentifier(id);
        return projectTaskRepository.findByProjectIdentifierOrderByPriority(id);
    }


    public ProjectTask findPTByProjectSequence(String backlog_id, String pt_id){

        Backlog backlog = backlogRepository.findByProjectIdentifier(backlog_id);
        ProjectTask projectTask = projectTaskRepository.findByProjectSequence(pt_id);

        return projectTask;
    }

    public ProjectTask updateByProjectSequence(ProjectTask updatedTask, String backlog_id, String pt_id){

        ProjectTask projectTask = findPTByProjectSequence(backlog_id, pt_id);
        projectTask = updatedTask;
        return projectTaskRepository.save(projectTask);
    }


    public void deletePTByProjectSequence(String backlog_id, String pt_id){
        ProjectTask projectTask = findPTByProjectSequence(backlog_id, pt_id);
        projectTaskRepository.delete(projectTask);
    }

}