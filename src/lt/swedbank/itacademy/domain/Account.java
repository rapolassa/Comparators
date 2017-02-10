package lt.swedbank.itacademy.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by rimas on 1/30/17.
 */
public class Account {
    private String accountNumber;
    private BigDecimal balance;
    private boolean active;
    private List<LeasingContract> leasingContracts;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<LeasingContract> getLeasingContracts() {
        return leasingContracts;
    }

    public void setLeasingContracts(List<LeasingContract> leasingContracts) {
        this.leasingContracts = leasingContracts;
    }
}
