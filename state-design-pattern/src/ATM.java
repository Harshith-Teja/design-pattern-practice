class ATM {
    private ATMState state;

    public ATM() {
        state = new NoCardState(this);
    }

    void setState(ATMState state) {
        this.state = state;
    }

    public void insertCard() {
        state.insertCard();
    }

    public void enterPin(int pin) {
        state.enterPin(pin);
    }

    public void withdrawMoney(int amount) {
        state.withdrawMoney(amount);
    }
}
