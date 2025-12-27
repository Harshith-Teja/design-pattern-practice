public class SupportChainFactory {

    public static SupportHandler createChain() {
        SupportHandler junior = new JuniorSupport();
        SupportHandler senior = new SeniorSupport();
        SupportHandler manager = new ManagerSupport();

        junior.setNext(senior);
        senior.setNext(manager);

        return junior; // start of the chain
    }
}
