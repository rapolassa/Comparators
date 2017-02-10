package lt.swedbank.itacademy.comparators;

import lt.swedbank.itacademy.domain.Account;
import lt.swedbank.itacademy.domain.AccountWithLeases;
import lt.swedbank.itacademy.domain.DomainInitializer;
import lt.swedbank.itacademy.domain.LeasingContract;

import java.util.Comparator;
import java.util.List;

/**
 * Created by P998RCB on 2017.02.08.
 */
public class CompareByNotTerminated implements Comparator<AccountWithLeases> {
  @Override
  public int compare(AccountWithLeases o1, AccountWithLeases o2) {


    if(o1.getLeasingContractList().size() == o2.getLeasingContractList().size())
    {
      return (o1.getSingleAccount().getAccountNumber()).compareTo(o2.getSingleAccount().getAccountNumber());
    }
    return (Integer.compare(o2.getLeasingContractList().size(), o1.getLeasingContractList().size()));
  }
}
