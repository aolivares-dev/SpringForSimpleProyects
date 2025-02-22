package development.backend.app.command;

public interface Command<X, Y> {
    Y execute(X request);
}
