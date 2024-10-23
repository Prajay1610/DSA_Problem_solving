package Arrays;
public class Buy_Sell_Stock {
    //OPTIMAL SOLUTION 
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            buyingPrice=Math.min(buyingPrice,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-buyingPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
       
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
        
    }
}
