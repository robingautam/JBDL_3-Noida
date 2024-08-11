package registration;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationHandler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("inside the do get method");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Inside the do Post Method");

        String name =  req.getParameter("name");
        String email =  req.getParameter("email");
        String password =  req.getParameter("password");

        System.out.println("Name: "+name+" Email: "+email+" Password: "+password);

        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        Cookie cookie = new Cookie("logged_user_name",name);



        resp.addCookie(cookie);


        printWriter.println("<h1>Welcome to the Home Page</h1>");
        printWriter.println("<p>below are you entered details</p>");
        printWriter.println("<p>Name: "+name+"</p>");
        printWriter.println("<p>Email: "+email+"</p>");
        printWriter.println("<p>Password: "+password+"</p>");




    }
}
