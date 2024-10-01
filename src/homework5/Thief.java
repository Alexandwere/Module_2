package homework5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

import static homework5.Runner.getBankMoney;

/**
 * Вор
 */
public class Thief {
    private BigDecimal money;

    private Thief() {
        this.money = BigDecimal.ZERO;
    }

    private void stealMoney(Bank bank) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException,
            InvocationTargetException {
        this.money = (BigDecimal) getBankMoney(bank); // Грабитель обогащается
        bankrupt(bank); //банк банкротится
    }

    @Override
    public String toString() {
        return "Thief{" +
                "money=" + money +
                '}';
    }

    private static void bankrupt(Bank bank) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        Method setBankMoney = bankClass.getDeclaredMethod("setMoney", BigDecimal.class);
        setBankMoney.setAccessible(true);
        setBankMoney.invoke(bank, BigDecimal.valueOf(0));
    }
}