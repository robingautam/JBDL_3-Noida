package ServletFirst;

import javax.servlet.*;
import java.io.IOException;

public class FirstServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Inside the Init Method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Inside the service method");

    }

    @Override
    public String getServletInfo() {
        return "First Servlet Program";
    }

    @Override
    public void destroy() {
        System.out.println("Inside the destroy method");
    }
}
