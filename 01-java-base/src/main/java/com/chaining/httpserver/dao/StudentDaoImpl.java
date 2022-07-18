package com.chaining.httpserver.dao;

import com.chaining.httpserver.domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class StudentDaoImpl implements BaseStudentDao {

    public static List<Student> studentList = new ArrayList<>();

    static {
        Student stu1 = new Student("heima001","张三","23","1999-11-11");
        Student stu2 = new Student("heima002","李四","24","2000-11-11");
        studentList.add(stu1);
        studentList.add(stu2);
    }


    @Override
    public boolean addStudent(Student stu) {
        studentList.add(stu);
        return true;
    }

    @Override
    public Student[] findAllStudent() {
        Student[] students = new Student[studentList.size()];

        for (int i = 0; i < studentList.size(); i++) {
            students[i] = studentList.get(i);
        }

        return students;
    }

    @Override
    public void deleteStudentById(String delId) {
        // 1. 查找id在容器中所在的索引位置
        int index = getIndex(delId);
        studentList.remove(index);
    }

    @Override
    public void updateStudent(String updateId, Student newStu) {
        // 1. 查找updateId, 在容器中的索引位置
        int index = getIndex(updateId);
        studentList.set(index,newStu);
    }

    @Override
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            Student stu = studentList.get(i);
            if(stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }
}
