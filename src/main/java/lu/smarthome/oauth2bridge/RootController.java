package lu.smarthome.oauth2bridge;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;

@RestController
@CrossOrigin("${app.api.cors}")
public class RootController {

    @GetMapping
    public RedirectView redirectRootToSwagger() {
        return new RedirectView("/me");
    }

    @GetMapping("me")
    public Object getMe(Principal p) {
        return p;
    }
}
