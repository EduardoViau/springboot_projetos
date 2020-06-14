package dudis.exemplorestrepositories.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dudis
 */
@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
        return "ola mundo";
    }


}
