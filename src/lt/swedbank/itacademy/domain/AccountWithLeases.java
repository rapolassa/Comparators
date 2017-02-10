package lt.swedbank.itacademy.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by P998RCB on 2017.02.08.
 */
public class AccountWithLeases {
  Account singleAccount;
  List<LeasingContract> leasingContractList;

  public AccountWithLeases(Account singleAccount, List<LeasingContract> leasingContractList) {
    this.singleAccount = singleAccount;
    this.leasingContractList = leasingContractList;
  }

  public Account getSingleAccount() {
    return singleAccount;
  }

  public List<LeasingContract> getLeasingContractList() {
    return leasingContractList;
  }
}
