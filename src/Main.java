import lt.swedbank.itacademy.domain.Account;
import lt.swedbank.itacademy.domain.AccountWithLeases;
import lt.swedbank.itacademy.domain.DomainInitializer;
import lt.swedbank.itacademy.domain.LeasingContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by P998RCB on 2017.02.08.
 */
public class Main {
  public static void main(String[] args) {
    List<Account> accounts = new DomainInitializer().initializeDomain();

    //Collections.sort(accounts,new AccountComparator()); // Pirma uzduotis
//    for (Account account: accounts) {
//      System.out.println(account.getAccountNumber());
//    }


    //Collections.sort(accounts,new CompareByBalance()); // Antra uzduotis
//    for (Account account: accounts) {
//      System.out.println(account.getAccountNumber());
//    }


//    List<LeasingContract> leasingContracts = new ArrayList<>(); // Trecia uzduotis
//    for (Account singleAccount: accounts ) {
//      if(singleAccount.getLeasingContracts() != null)
//      leasingContracts.addAll(singleAccount.getLeasingContracts());
//    }
//    Collections.sort(leasingContracts,new CompareByLeasing());
    //    for (Account account: accounts) {
//      System.out.println(account.getAccountNumber());
//    }


    List<LeasingContract> leasingContracts = new ArrayList<>(); // We have all the leasing accounts available
    List<AccountWithLeases> accountsWithLeasesList = new ArrayList<>();


    for (Account singleAccount : accounts) { // Contracts without Leases
      List<LeasingContract> notTerminatedLeasingContracts = new ArrayList<>(); // We have all the leasing accounts

      if (singleAccount.getLeasingContracts() != null) {
        leasingContracts.addAll(singleAccount.getLeasingContracts());
      }

      for (LeasingContract singleLeasingContract : leasingContracts) {
        if (singleLeasingContract.getTerminationDate() != null) {
          notTerminatedLeasingContracts.add(singleLeasingContract);

        }
      }
      AccountWithLeases accountsWithLeases = new AccountWithLeases(singleAccount, notTerminatedLeasingContracts);
      accountsWithLeasesList.add(accountsWithLeases);
      // System.out.println(accountsWithLeasesList);


    }


    // Collections.sort(accountsWithLeasesList,new CompareByNotTerminated());

    for (AccountWithLeases account : accountsWithLeasesList) {
      System.out.println(account.getSingleAccount().getAccountNumber() + " " + account.getLeasingContractList().size());
    }
  }
}
