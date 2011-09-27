/**
 * User: Tomofumi Kitano <tomofumikitano@gmail.com>
 * Date: 2011/07/07/
 */
package tommons.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import tommons.service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends AbstractController {

    LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        LoginService.LoginStatus result = loginService.login(username, password);

        if (result == LoginService.LoginStatus.SUCCESS) {
            System.out.println("Login successful.");
            request.getSession().setAttribute("user", username);
            return new ModelAndView("forward:/home.tm");
        } else {
            System.err.println("Login failed.");
        }
        
        return null;
    }
}
