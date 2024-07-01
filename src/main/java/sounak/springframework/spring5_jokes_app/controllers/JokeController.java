package sounak.springframework.spring5_jokes_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sounak.springframework.spring5_jokes_app.services.JokeService;

/**
 * Created by sounak on 01-07-2024.
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }

}
