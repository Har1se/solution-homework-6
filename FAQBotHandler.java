class FAQBotHandler extends SupportHandler {
    @Override
    protected boolean canHandle(String issue) {
        return issue.equals("password_reset") || issue.equals("faq_question");
    }

    @Override
    protected void process(String issue) {
        logger.info("[FAQBot] Handled " + issue);
    }
}


