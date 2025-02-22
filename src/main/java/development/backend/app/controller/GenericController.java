package development.backend.app.controller;

import development.backend.app.command.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/${api.version}/${api.base-path}")
public class GenericController {

    @Autowired
    @Qualifier("GenericCommand")
    protected Command<String, String> genericCommand;

    @GetMapping
    public String genericEndpoint() {
        return genericCommand.execute("Hello, World!");
    }
}
