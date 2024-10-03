package site.javadev.lesson_12;

import java.util.Comparator;

/**
 * Компаратор для сортировки монет:
 * - Сначала по номиналу
 * - Если номинал одинаковый, то по стране
 * - Если и страна одинаковая, то по диаметру
 */
public class CoinComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin coin1, Coin coin2) {
        int nominalComparison = coin1.getNominal().compareTo(coin2.getNominal());
        if (nominalComparison != 0) {
            return nominalComparison;
        }

        int countryComparison = coin1.getCountry().compareTo(coin2.getCountry());
        if (countryComparison != 0) {
            return countryComparison;
        }

        return coin1.getDiameter().compareTo(coin2.getDiameter());
    }
}
