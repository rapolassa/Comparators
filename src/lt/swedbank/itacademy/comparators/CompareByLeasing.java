package lt.swedbank.itacademy.comparators;

import lt.swedbank.itacademy.domain.Account;
import lt.swedbank.itacademy.domain.LeasingContract;

import java.util.Comparator;

/**
 * Created by P998RCB on 2017.02.08.
 */
public class CompareByLeasing implements Comparator<LeasingContract> {
  @Override
  public int compare(LeasingContract o1, LeasingContract o2) {
    return -1*o1.getValidFrom().compareTo(o2.getValidFrom());
  }
}

