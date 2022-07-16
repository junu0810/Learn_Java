package hello.servlet.basic.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

@WebServlet(name = "requestParamServlet" , urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet{
  
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{

            System.out.println(("[전체 파라미터 조회] - start"));
            
            req.getParameterNames().asIterator()
            .forEachRemaining(paramName -> System.out.println(paramName + '=' + req.getParameter(paramName)));
            //http://localhost:8080/request-param?username=hello&age=20
            System.out.println(("[전체 파라미터 조회] - end"));
            System.out.println();
            String username = req.getParameter("username");
            String age = req.getParameter("age");
            System.out.println();
            
            System.out.println(("[단일 파라미터 조회]"));
            System.out.println("username = " + username);
            System.out.println("age = " + age);
            System.out.println();
            
            //http://localhost:8080/request-param?username=hello&age=20&username=hello2
            System.out.println(("[복수 파라미터 조회]"));
            String[] usernames = req.getParameterValues("username");
            for (String name: usernames ){
                System.out.println("유저네임은 " + name);
            }
            
            resp.getWriter().write("Ok");
        }
    }
