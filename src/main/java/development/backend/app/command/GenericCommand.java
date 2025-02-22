package development.backend.app.command;

import development.backend.app.logic.GenericLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("GenericCommand")
public class GenericCommand implements Command<String, String> {

    @Autowired
    private GenericLogic genericLogic;

    @Override
    public String execute(String request) {
        return request;
    }
}
