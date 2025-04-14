class SeniorSupportHandler extends SupportHandler {
    @Override
    protected boolean canHandle(String issue) {
        return issue.equals("account_ban") || issue.equals("data_loss");
    }

    @Override
    protected void process(String issue) {
        logger.info("[SeniorSupport] Handled " + issue);
    }
}
