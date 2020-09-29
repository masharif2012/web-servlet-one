package authentication;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="SignIn", urlPatterns ="login")
public class SignIn extends HttpServlet {
    public String message;

    public void init()throws ServletException{
        System.out.println("..........Servelet Initializing..........");
        message = "welcome to my web world!";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>" +"Sign-in not required to watch the free demo" + "<h1>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if(userName.equalsIgnoreCase("sharif") && password.equalsIgnoreCase("sharif12")){
            PrintWriter printWriter = response.getWriter();
            printWriter.println("<h1>" + "you are authorized user. Welcome to servlet demo!"+"</h1>");
        }else {
            response.setContentType("text/html");

            PrintWriter printWriter = response.getWriter();
            printWriter.println("<h1>" + "Sorry!, you are NOT an authorized user. "+"</h1>");

        }

    }
    public void destroy(){
        System.out.println("Servlet is being destroyed....");
    }
}
