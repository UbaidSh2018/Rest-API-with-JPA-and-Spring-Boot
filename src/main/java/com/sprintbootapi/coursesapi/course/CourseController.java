package com.sprintbootapi.coursesapi.course;

import com.sprintbootapi.coursesapi.topic.Topic;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> listOfCourses(@PathVariable String topicId){
        return courseService.getAllCourses(topicId);
    }

    @RequestMapping("/topics/{topicId}/courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId){
        return courseService.getCourseById(courseId);
    }

    @PostMapping(value = "/topics/{topicId}/courses")
    public void addNewCourse(@RequestBody Course course , @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        courseService.saveOrUpdate(course);
    }

    @PutMapping(value = "/topics/{topicId}/courses/{courseId}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        courseService.saveOrUpdate(course);
    }

    @DeleteMapping(value = "/topics/{topicId}/courses/{courseId}")
    public void deleteCourse(@PathVariable String courseId ){
        courseService.deleteCourse(courseId);
    }


}
