package banks;

import adt.Atm;

public class IOBATM implements Atm {
    @Override
    public double deposit(double amount) {
        return 1_00_00_00_000.0;
    }

    @Override
    public double withdraw(double amount) {
        return 1_00_00_00_000.0;
    }

    @Override
    public void showBalance() {
        System.out.println(1_00_00_00_000.0);

    }

    @Override
    public boolean verifyPin(int atmPin) {
        final int actualPin = 1234;
        return atmPin == actualPin;
    }
}
