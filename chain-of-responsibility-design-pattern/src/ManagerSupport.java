public class ManagerSupport extends AbstractSupportHandler {

    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getLevel() == 3) {
            System.out.println("Manager handled: " + ticket.getIssue());
        } else {
            System.out.println("No one could handle: " + ticket.getIssue());
        }
    }
}
