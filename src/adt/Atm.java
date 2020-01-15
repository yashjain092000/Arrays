package adt;

public interface Atm {
    public double deposit(double amount);

    public double withdraw(double amount);

    public void showBalance();

    public boolean verifyPin(int atmPin);
}
