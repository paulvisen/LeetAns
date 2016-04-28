package ans;

/**
 * Created by Administrator on 2016-04-28.
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.

 If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 *求解买袜子获得的最大的利润
 */
public class Leet121 {


    public static int maxProfit(int[] prices){

        int len=prices.length;
        if(len==0)
            return  0;
        int mMin=prices[0];
        int result=0;
        for(int i=0;i<len;i++)
        {
            mMin=Math.min(mMin, prices[i]);
            result=Math.max(result, prices[i] - mMin);
        }
        return result;
    }




}
