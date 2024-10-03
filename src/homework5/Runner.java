package homework5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class Runner {

    public final static BigDecimal MONEY_IN_BANK = BigDecimal.valueOf(1500);

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, NoSuchFieldException {
        Bank bank = createBank(MONEY_IN_BANK);
        Thief thief = createThief();

        stealMoney(thief, bank);
        System.out.printf("Вор - %s денег\n", getThiefMoney(thief));
        System.out.printf("Банк - %s денег\n", getBankMoney(bank));

    }

    private static Bank createBank(BigDecimal money) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        Constructor<Bank> bankConstructor = bankClass.getDeclaredConstructor(BigDecimal.class);
        bankConstructor.setAccessible(true);
        return bankConstructor.newInstance(money);
    }

    private static Thief createThief() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        Constructor<Thief> thiefConstructor = thiefClass.getDeclaredConstructor();
        thiefConstructor.setAccessible(true);
        return thiefConstructor.newInstance();
    }

    private static void stealMoney(Thief thief, Bank bank) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        Method stealMoney = thiefClass.getDeclaredMethod("stealMoney", Bank.class);
        stealMoney.setAccessible(true);
        stealMoney.invoke(thief, bank);
    }

    public static BigDecimal getBankMoney(Bank bank) throws NoSuchFieldException, IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        Field moneyField = bankClass.getDeclaredField("money");
        moneyField.setAccessible(true);
        return (BigDecimal) moneyField.get(bank);
    }

    public static BigDecimal getThiefMoney(Thief thief) throws NoSuchFieldException, IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        Field moneyField = thiefClass.getDeclaredField("money");
        moneyField.setAccessible(true);
        return (BigDecimal) moneyField.get(thief);
    }



}

