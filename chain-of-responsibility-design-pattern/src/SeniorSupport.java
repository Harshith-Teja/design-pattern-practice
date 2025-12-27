public class SeniorSupport extends AbstractSupportHandler {

    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getLevel() == 2) {
            System.out.println("Senior handled: " + ticket.getIssue());
        } else {
            passToNext(ticket);
        }
    }
}
