package org.faucet_pipeline.demo.webmvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Michael J. Simons, 2018-02-19
 */
@Controller
@RequiredArgsConstructor
public class IdeasController {

    private final IdeaRepository ideaRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
