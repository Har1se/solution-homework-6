import java.util.logging.Logger;

abstract class SupportHandler {
    private SupportHandler nextHandler;
    protected Logger logger = Logger.getLogger(this.getClass().getName());

    public SupportHandler setNext(SupportHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public void handle(String issue) {
        if (canHandle(issue)) {
            process(issue);
        } else if (nextHandler != null) {
            logger.info("[" + this.getClass().getSimpleName() + "] Cannot handle " + issue + " - forwarding to next handler");
            nextHandler.handle(issue);
        } else {
            logger.info("[" + this.getClass().getSimpleName() + "] Cannot handle " + issue + " - escalate manually");
        }
    }

    protected abstract boolean canHandle(String issue);
    protected abstract void process(String issue);
}