package cn.wmyskxz.controller;

import cn.wmyskxz.entity.Student;
import cn.wmyskxz.entity.User;
import cn.wmyskxz.service.StudentService;
import cn.wmyskxz.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.RowSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("")
public class StudentController {

    @Autowired
    private StudentService studentService;


   @RequestMapping("/index")
    public String tolistStudent(HttpServletRequest request){


       String  username = request.getParameter("Username");
       String  password = request.getParameter("Password");
       if (username != null && username.equals("tony")
                    && password != null &&  password.equals("123")){
                return "/views/listStudent";
            }

       return "/views/error";
    }

    @RequestMapping("/findStudent")
    public  String toFindStudent(HttpServletRequest request, HttpServletResponse response){

        return "/views/findStudent";
    }

    @RequestMapping("/seekStudent")
    public ModelAndView toseekStudent(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("/views/resultStudent");

        int student_id = Integer.parseInt(request.getParameter("student_id"));
        System.out.println(student_id);
        Student student = studentService.findStudent(student_id);
        System.out.println(student);
        mav.addObject("student", student);
        return mav;
    }

    @RequestMapping("/indexStudent")
    public  String toIndexStudent(HttpServletRequest request){
       return "/views/indexStudent";
    }

    @RequestMapping("/showresult")
    public String toShowList(HttpServletRequest request, HttpServletResponse response) {


        // 获取分页参数
        int start = 0;
        int count = 10;

        try {
            int number = Integer.parseInt(request.getParameter("idstudent"));
            System.out.println("查询信息学生的学号为："+number);
            start = Integer.parseInt(request.getParameter("page.start"));
            count = Integer.parseInt(request.getParameter("page.count"));
        } catch (Exception e) {
        }

        Page page = new Page(start, count);

        List<Student> students = studentService.list(page.getStart(), page.getCount());
        int total = studentService.getTotal();
        page.setTotal(total);

        request.setAttribute("students", students);
        request.setAttribute("page", page);

        return "/views/showresult";
    }

    @RequestMapping("/StudentList")
        public String toStudentList(HttpServletRequest request, HttpServletResponse response) {

            // 获取分页参数
            int start = 0;
            int count = 10;

            try {
                start = Integer.parseInt(request.getParameter("page.start"));
                count = Integer.parseInt(request.getParameter("page.count"));
            } catch (Exception e) {
            }

            Page page = new Page(start, count);

            List<Student> students = studentService.list(page.getStart(), page.getCount());
            int total = studentService.getTotal();
            page.setTotal(total);

            request.setAttribute("students", students);
            request.setAttribute("page", page);

        return "/views/StudentList";
    }

    @RequestMapping("/addStudent")
    public String addStudent(HttpServletRequest request, HttpServletResponse response) {

        Student student = new Student();

        int studentID = Integer.parseInt(request.getParameter("student_id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("sex");
        Date birthday = null;
        // String 类型按照 yyyy-MM-dd 的格式转换为 java.util.Date 类
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            birthday = simpleDateFormat.parse(request.getParameter("birthday"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        student.setStudent_id(studentID);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setBirthday(birthday);

        studentService.addStudent(student);

        return "/views/listStudent";
    }

    @RequestMapping("/listStudent")
    public String listStudent(HttpServletRequest request, HttpServletResponse response) {

        // 获取分页参数
        int start = 0;
        int count = 10;

        try {
            start = Integer.parseInt(request.getParameter("page.start"));
            count = Integer.parseInt(request.getParameter("page.count"));
        } catch (Exception e) {
        }

        Page page = new Page(start, count);

        List<Student> students = studentService.list(page.getStart(), page.getCount());
        int total = studentService.getTotal();
        page.setTotal(total);

        request.setAttribute("students", students);
        request.setAttribute("page", page);

        return "/views/listStudent";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(int id) {
        studentService.deleteStudent(id);
        return "/views/listStudent";
    }

    @RequestMapping("/editStudent")
    public ModelAndView editStudent(int id) {
        ModelAndView mav = new ModelAndView("/views/editStudent");
        Student student = studentService.getStudent(id);
        mav.addObject("student", student);
        return mav;
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(HttpServletRequest request, HttpServletResponse response) {

        Student student = new Student();

        int id = Integer.parseInt(request.getParameter("id"));
        int student_id = Integer.parseInt(request.getParameter("student_id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("sex");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = simpleDateFormat.parse(request.getParameter("birthday"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        student.setId(id);
        student.setStudent_id(student_id);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setBirthday(birthday);

        studentService.updateStudent(student);
        return "/views/listStudent";
    }
}
