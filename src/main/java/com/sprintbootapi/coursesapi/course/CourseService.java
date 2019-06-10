package com.sprintbootapi.coursesapi.course;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    List<Course> getAllCourses(String topicId){
        return new ArrayList<>(courseRepository.findByTopicId(topicId));
    }

    Course getCourseById(String courseID){
      return courseRepository.findById(courseID).get();
    }

    void saveOrUpdate(Course course){
       courseRepository.save(course);
    }

    void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
