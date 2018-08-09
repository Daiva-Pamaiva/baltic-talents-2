package lt.baltictalents.lecture7;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.valueOf;

/**
 * Tarkime yra parduota kažkiek prekių (x) už kažkokią kainą (y) ir tai
 * sudaro kažkokią sumą (z). Visos šitos sumos yra su PVM 21%.
 * Parašykite metodą/funkciją kurią iškvietus su parametrais: kiekis, suma
 * su PVM - ta funkcija atspausdintų pardavimo įrašą tokiu formatu:
 * 1. prekės kaina be PVM (tikslumas ? ženklai po kablelio)
 * 2. kiekis
 * 3. suma be PVM (tikslumas 2 ženklai po kablelio)
 * 4. PVM suma (tikslumas 2 ženklai po kablelio)
 * 5. viso suma su PVM (tikslumas 2 ženklai po kablelio)
 * <p>
 * [suma su PVM] = 100% + 21%
 * [suma be PVM = [suma su PVM] / 121 * 100
 * [prekes vieneto kaina be PVM] = [suma be PVM] / [kiekis]
 * [PVM suma] = [suma su PVM] - [suma be PVM]
 */

class VatPrice {
    private static final String CURRENCY = "€";

    public static void main(String args[]) {
        printReceipt(4, new BigDecimal("200"));
    }

    private static void printReceipt(int quantity, BigDecimal totalAmount) {
        final BigDecimal netAmount = totalAmount.divide(valueOf(121), 2, RoundingMode.HALF_UP).multiply(valueOf(100));
        final BigDecimal vatAmount = totalAmount.subtract(netAmount);
        final BigDecimal itemPrice = netAmount.divide(valueOf(quantity));

        System.out.println(String.format("Item Price (excluding VAT): %.2f %s", itemPrice, CURRENCY));
        System.out.println(String.format("Quantity: %d", quantity));
        System.out.println(String.format("Net Amount (excluding VAT): %.2f %s", netAmount, CURRENCY));
        System.out.println(String.format("VAT Amount: %.2f €", vatAmount));
        System.out.println(String.format("Gross Amount (including VAT): %.2f %s", totalAmount, CURRENCY));
    }
}
