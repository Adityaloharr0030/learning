package adya;

public class buy_n_sell_stock {
    //    you are given an array price where price [i] is the price
//    of a given stock on the ith day. you want to maximize your
//    profit  by choosing a single day to buy one stock and  choosing
//    a different day in the future to sell that stock. return the maximum
//    profit you can archive form this transaction. if you cannot archiv
//    any profit , return 0 ;;price[] = {7, 1, 5, 3, 6, 4};
    public static int stock(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = price[i];

            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        System.out.println(stock(price));
    }
}