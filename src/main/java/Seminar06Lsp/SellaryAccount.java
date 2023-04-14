package Seminar06Lsp;

import java.math.BigDecimal;

public class SellaryAccount extends Account {
    @Override
    public BigDecimal balance(String numberAccount) {
        return super.balance(numberAccount);
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        super.refill(numberAccount, sum);
    }


    public void payment(String numberaccount, BigDecimal sum) {
       payment(numberaccount, sum);
    }
}
