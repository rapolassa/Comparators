package lt.swedbank.itacademy.domain;

import lt.swedbank.itacademy.domain.Account;
import lt.swedbank.itacademy.domain.LeasingContract;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by rimas on 2/7/17.
 */
public class DomainInitializer {

    public static List<Account> initializeDomain() {
        List<Account> accounts = new ArrayList<>();

        // ACCOUNT 1

        Account acc1 = new Account();
        acc1.setAccountNumber("LT412022343838643557");
        acc1.setActive(true);
        acc1.setBalance(BigDecimal.valueOf(300.0));

        List<LeasingContract> leasContracts1 = new ArrayList<>();

        LeasingContract contr11 = new LeasingContract();
        contr11.setContractAmount(BigDecimal.valueOf(500000));
        contr11.setName("Buto kontraktas");
        contr11.setValidFrom(getDateFromString("2014-11-11"));

        leasContracts1.add(contr11);

        LeasingContract contr12 = new LeasingContract();
        contr12.setContractAmount(BigDecimal.valueOf(100000));
        contr12.setName("Automobilio kontraktas");
        contr12.setValidFrom(getDateFromString("2013-07-01"));

        leasContracts1.add(contr12);

        LeasingContract contr13 = new LeasingContract();
        contr13.setContractAmount(BigDecimal.valueOf(1000));
        contr13.setName("Telefono kontraktas");
        contr13.setTerminationDate(getDateFromString("2012-01-15"));
        contr13.setValidFrom(getDateFromString("2010-01-01"));

        leasContracts1.add(contr13);

        acc1.setLeasingContracts(leasContracts1);

        accounts.add(acc1);

        // ACCOUNT 2

        Account acc2 = new Account();
        acc2.setAccountNumber("LT861234634538261895");
        acc2.setActive(true);
        acc2.setBalance(BigDecimal.valueOf(300.0));

        List<LeasingContract> leasingContracts2 = new ArrayList<>();

        LeasingContract contr21 = new LeasingContract();
        contr21.setContractAmount(BigDecimal.valueOf(500000));
        contr21.setName("Buto kontraktas");
        contr21.setValidFrom(getDateFromString("2017-01-18"));

        leasContracts1.add(contr21);

        LeasingContract contr22 = new LeasingContract();
        contr22.setContractAmount(BigDecimal.valueOf(100000));
        contr22.setName("Automobilio kontraktas");
        contr22.setValidFrom(getDateFromString("2014-07-01"));

        leasContracts1.add(contr22);

        LeasingContract contr23 = new LeasingContract();
        contr23.setContractAmount(BigDecimal.valueOf(900));
        contr23.setName("Telefono kontraktas");
        contr23.setValidFrom(getDateFromString("2015-12-15"));

        leasingContracts2.add(contr23);

        acc2.setLeasingContracts(leasingContracts2);

        accounts.add(acc2);

        // ACCOUNT 3

        Account acc3 = new Account();
        acc3.setAccountNumber("LT021251173509022158");
        acc3.setActive(false);
        acc3.setBalance(BigDecimal.valueOf(300.0));

        List<LeasingContract> leasContracts3 = new ArrayList<>();

        LeasingContract contr31 = new LeasingContract();
        contr31.setContractAmount(BigDecimal.valueOf(100000));
        contr31.setName("Namo kontraktas");
        contr31.setValidFrom(getDateFromString("2030-11-11"));

        leasContracts3.add(contr31);

        acc3.setLeasingContracts(leasContracts3);

        accounts.add(acc3);

        // ACCOUNT 4

        Account acc4 = new Account();
        acc4.setAccountNumber("PL20417391712415996711411550");
        acc4.setActive(true);
        acc4.setBalance(BigDecimal.valueOf(0.0));

        accounts.add(acc4);

        // ACCOUNT 5

        Account acc5 = new Account();
        acc5.setAccountNumber("LV72FZLATHQSZPF9EY3HQ");
        acc5.setActive(false);
        acc5.setBalance(BigDecimal.valueOf(-1000.0));

        List<LeasingContract> leasContracts5 = new ArrayList<>();

        LeasingContract contr51 = new LeasingContract();
        contr51.setContractAmount(BigDecimal.valueOf(2000));
        contr51.setName("Kompiuterio lizingas");
        contr51.setValidFrom(getDateFromString("2013-06-01"));
        contr51.setTerminationDate(getDateFromString("2016-06-11"));

        leasContracts5.add(contr51);
        acc5.setLeasingContracts(leasContracts5);
        accounts.add(acc5);

        return accounts;
    }

    private static Date getDateFromString(String dateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date;

        try {
            date = simpleDateFormat.parse(dateString);
        } catch (ParseException ex) {
            date = new Date();
        }

        return date;
    }

}
