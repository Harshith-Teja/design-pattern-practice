public abstract class AbstractSupportHandler implements SupportHandler {

    protected SupportHandler next;

    @Override
    public void setNext(SupportHandler next) {
        this.next = next;
    }

    protected void passToNext(SupportTicket ticket) {
        if (next != null) {
            next.handleRequest(ticket);
        }
    }
}
