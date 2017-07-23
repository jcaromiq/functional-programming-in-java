package introduction.fpij;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Discount {
    public static final List<BigDecimal> PRICES = Arrays.asList(
            new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
            new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
            new BigDecimal("45"), new BigDecimal("12"));

    public static void main(String[] args) {
        imperativeWay();
        functionalWay();
    }

    private static void functionalWay() {
        System.out.println("Functional: ");
        final BigDecimal totalOfDiscountPrices =
                PRICES.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0 )
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total of discount prices: " + totalOfDiscountPrices);
    }

    private static void imperativeWay() {
        System.out.println("Imperative: ");

        BigDecimal totalOfDiscountPrices = BigDecimal.ZERO;

        for(BigDecimal price : PRICES) {
            if(price.compareTo(BigDecimal.valueOf(20)) > 0)
                totalOfDiscountPrices = totalOfDiscountPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
        }
        System.out.println("Total of discount prices: " + totalOfDiscountPrices);
    }
}
