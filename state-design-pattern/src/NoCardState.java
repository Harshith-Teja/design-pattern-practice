class NoCardState implements ATMState {
    private ATM atm;

    public NoCardState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Card inserted.");
        atm.setState(new HasCardState(atm));
    }

    public void enterPin(int pin) {
        System.out.println("Insert card first.");
    }

    public void withdrawMoney(int amount) {
        System.out.println("Insert card first.");
    }
}
