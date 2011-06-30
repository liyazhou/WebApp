/**
 * User: Tomofumi Kitano
 * Date: 2011/07/01/
 */
package tommons.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello.tm")
    public ModelAndView helloWorld() {
        String message = "Hello World!";
        return new ModelAndView("hello", "message", message);
    }
}
