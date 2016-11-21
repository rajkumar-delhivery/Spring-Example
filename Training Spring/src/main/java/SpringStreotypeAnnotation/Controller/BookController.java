package SpringStreotypeAnnotation.Controller;

import SpringStreotypeAnnotation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by delhivery on 26/10/16.
 */

@Controller
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/service")

    public ModelAndView bookName(ModelAndView modelAndView){

        modelAndView.addObject("bookName", bookService.larrgestAreaBookName());
        modelAndView.setViewName("success");
        return modelAndView;

    }
}
