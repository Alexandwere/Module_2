package homework5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 * Вор
 */
public class Thief {
    private BigDecimal money;

    private Thief() {
        this.money = BigDecimal.ZERO;
    }
// СДЕЛАТЬ МЕТОД ПРИВАТНЫМ И ВЫЗВАТЬ
    public void stealMoney(Bank bank) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException,
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

    public static Object getBankMoney(Bank bank) throws NoSuchFieldException, IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        Field moneyField = bankClass.getDeclaredField("money");
        moneyField.setAccessible(true);
        Object bankMoney = moneyField.get(bank);
        return bankMoney;
    }

    public static void bankrupt(Bank bank) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        Method setBankMoney = bankClass.getDeclaredMethod("setMoney", BigDecimal.class);
        setBankMoney.setAccessible(true);
        setBankMoney.invoke(bank, BigDecimal.valueOf(0));
    }
}