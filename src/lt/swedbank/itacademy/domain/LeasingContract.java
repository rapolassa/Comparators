package lt.swedbank.itacademy.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by rimas on 1/30/17.
 */
public class LeasingContract {
    private Date validFrom;
    private Date terminationDate;
    private String name;
    private BigDecimal contractAmount;

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }
}
