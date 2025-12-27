public interface SupportHandler {
    void setNext(SupportHandler next);
    void handleRequest(SupportTicket ticket);
}
