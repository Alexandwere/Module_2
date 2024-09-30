package homework5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

public class Runner {

    //Итог:
    //Вор - 1500 денег
    //Банк - 0 денег
    public final static BigDecimal MONEY_IN_BANK = BigDecimal.valueOf(1500);

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Bank bank = createBank(MONEY_IN_BANK);
        Thief thief = createThief();
        System.out.println(bank);
        System.out.println(thief);

        thief.stealMoney(bank);
        System.out.printf("Вор - %s денег\n", thief);
        System.out.printf("Банк - %s денег\n", bank);

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
        Thief thief = thiefConstructor.newInstance();
        return thief;
    }


}

