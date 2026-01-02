class AuthenticatedState implements ATMState {
    private ATM atm;

    public AuthenticatedState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Transaction in progress.");
    }

    public void enterPin(int pin) {
        System.out.println("Already authenticated.");
    }

    public void withdrawMoney(int amount) {
        System.out.println("Withdrawing " + amount);
        atm.setState(new NoCardState(atm)); // eject card
    }
}
