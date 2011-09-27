/**
 * User: Tomofumi Kitano
 * Date: 2011/07/01/
 */
package tommons.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class HomeController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String user = (String) request.getSession().getAttribute("user");
        
        Map map = new HashMap();
        map.put("user", user);
        
        return new ModelAndView("home", "command", map);
    }
}
