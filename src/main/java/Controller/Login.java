package Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class Login {
    @GetMapping(value="/login")
    public void login() {

        System.out.println("Hello");
    }

    }

