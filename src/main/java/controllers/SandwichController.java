package controllers;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {

    Logger logger = LogManager.getLogger(SandwichController.class);

    @RequestMapping("")
    public ModelAndView loadIndex() {
        ModelAndView index = new ModelAndView("index");
        logger.info("open index.jsp");
        return index;
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public ModelAndView loadResult(@RequestParam ("menu") String[] menu, Model model) {
        BasicConfigurator.configure();
        logger.info("go to loadResult");
        ModelAndView result = new ModelAndView("result");
        model.addAttribute("menu", menu);
        logger.info("go to result.jsp with object menu");
        return result;
    }
}