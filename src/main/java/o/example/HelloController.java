package o.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello(@RequestParam(value = "userName", required = false) String userName) {
        System.out.println("Hello " + userName);
        return "hello";
    }

    @GetMapping("/path/{userName}")
    public String helloPath(@PathVariable("userName") String userName) {
        System.out.println("Hello " + userName);
        return "hello";
    }
@RequestMapping("/JDBC")
public class JDBC {
    @GetMapping("/JDBC")
    public String Students(ModelMap model) throws SQLException {
        final String URL = "jdbc:mysql://localhost:3306/JDBC/JDBC";
        final String user = "root";
        final String pass = "Ismaillox3920561";

        Connection connection;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        connection = DriverManager.getConnection(URL, user, pass);
        preparedStatement = connection.prepareStatement("select * from student");
        resultSet = preparedStatement.executeQuery();

        List<String> students = new ArrayList<>();
        while (resultSet.next()) {
            students.add(resultSet.getString("name"));
        }
        model.put("names", students);
        return "JDBC";
    }
}


//    @ExceptionHandler(SQLException.class)
//    public ModelAndView resolveException(HttpServletRequest request, Exception ex) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception", ex);
//        modelAndView.addObject("URL", request.getRequestURL());
//        modelAndView.setViewName("error");
//        return modelAndView;
//    }
}
