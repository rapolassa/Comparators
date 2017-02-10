package lt.swedbank.itacademy.comparators;

import lt.swedbank.itacademy.domain.Account;

import java.util.Comparator;

/**
 * Created by P998RCB on 2017.02.08.
 */
public class AccountComparator implements Comparator<Account> {
  @Override
  public int compare(Account o1, Account o2) {
    if (o1.isActive() && o2.isActive()) {
      o1.getAccountNumber().compareTo(o2.getAccountNumber());
    } else if (!o1.isActive() && !o2.isActive()) {
      o2.getAccountNumber().compareTo(o1.getAccountNumber());
    } else if (o1.isActive()) {
      return -1;
    }
    return 1;

  }
}
