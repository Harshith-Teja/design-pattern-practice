public class Main {
    public static void main(String[] args) {

        SupportHandler chain = SupportChainFactory.createChain();

        chain.handleRequest(new SupportTicket("Password reset", 1));
        chain.handleRequest(new SupportTicket("Software crash", 2));
        chain.handleRequest(new SupportTicket("Data loss", 3));
    }
}