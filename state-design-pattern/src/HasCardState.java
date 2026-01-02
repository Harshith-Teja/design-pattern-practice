class HasCardState implements ATMState {
    private ATM atm;

    public HasCardState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    public void enterPin(int pin) {
        if(pin == 1234) {
            System.out.println("PIN correct.");
            atm.setState(new AuthenticatedState(atm));
        } else {
            System.out.println("Wrong PIN.");
        }
    }

    public void withdrawMoney(int amount) {
        System.out.println("Enter PIN first.");
    }
}
