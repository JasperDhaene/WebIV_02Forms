package domain;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public class Account {

    @NumberFormat(pattern="#,##0.00")
    private BigDecimal balance = new BigDecimal("20003000.2599");
    
    @NumberFormat(style=NumberFormat.Style.PERCENT)
    private double percent = 0.25;
    
    private BigDecimal balance2;
    private double percent2;
    
    private String email;
    
    //Date is short, time is medium form
    @DateTimeFormat(style="SM")
    private Date dateStyle = Calendar.getInstance().getTime();
    
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date datePattern = Calendar.getInstance().getTime();

    public Date getDateStyle() {
        return dateStyle;
    }

    public void setDateStyle(Date dateStyle) {
        this.dateStyle = dateStyle;
    }

    public Date getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(Date datePattern) {
        this.datePattern = datePattern;
    }

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
