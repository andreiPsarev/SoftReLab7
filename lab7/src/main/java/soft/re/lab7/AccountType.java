package soft.re.lab7;

public class AccountType {
    private boolean premium;

    AccountType(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    @Override
    public String toString() {
        return premium ? "premium" : "normal";
    }
}
