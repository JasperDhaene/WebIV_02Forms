package domain;

import java.math.BigDecimal;
import org.springframework.format.annotation.NumberFormat;

public class Account {

    //@NumberFormat(pattern="#,##0.00")
    private BigDecimal balance = new BigDecimal("20003000.2599");
    
    //@NumberFormat(style=NumberFormat.Style.PERCENT)
    private double percent = 0.25;
    
    private BigDecimal balance2;
    private double percent2;
    
    private String email;

    public BigDecimal getBalance() {
        return balance;
    }

    public double getPercent() {
        return percent;
    }

    public BigDecimal getBalance2() {
        return balance2;
    }

    public double getPercent2() {
        return percent2;
    }

    public String getEmail() {
        return email;
    }

    public void simpleExample()
    {
        balance2 = new BigDecimal(balance.toString());
        percent2 = percent;
    }
    
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
