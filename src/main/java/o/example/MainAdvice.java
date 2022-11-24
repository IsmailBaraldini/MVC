package o.example;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLClientInfoException;

@ControllerAdvice
public class MainAdvice
{
    @ExceptionHandler(SQLClientInfoException.class)
    public String SQLException(HttpServletRequest request,Exception exception) {

        return "error";
    }

}
