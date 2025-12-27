public class JuniorSupport extends AbstractSupportHandler {

    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getLevel() == 1) {
            System.out.println("Junior handled: " + ticket.getIssue());
        } else {
            passToNext(ticket);
        }
    }
}
