public abstract class AbstractSupportHandler implements SupportHandler {
    protected SupportHandler nexthandler;

    @Override
    public SupportHandler setNext(SupportHandler handler){
        this.nexthandler = handler;
        return handler;
    }
    protected void forward(String issue) {
        if (nexthandler != null) {
            nexthandler.handle(issue);
        } else {
            System.out.println("[Support] Cannot handle " + issue + " - escalate manually.");
        }
    }
}
