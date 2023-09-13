import jdk.net.Sockets;
import org.w3c.dom.*;

import javax.crypto.MacSpi;
import javax.print.DocFlavor;
import javax.security.auth.login.AccountException;
import javax.swing.text.Keymap;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;

public class StockPrice {
    public static void main(String[] args) {
	  int[] prices = new int[]{2,1,2,1,0,1,2};
      System.out.println("Max Profit is : " +maxProfit(prices) );

	    }

	public static int maxProfit(int [] prices) {
    	int minSoFar = Integer.MAX_VALUE;
    	int maxProfit = 0;
    	int maxProfitNow = 0;
	 for(int i =0; i <prices.length; i ++) {
         if (prices[i] < minSoFar) {
	         minSoFar = prices[i];
         }
	         maxProfitNow = prices[i] - minSoFar;
	         if ( maxProfitNow > maxProfit ) {
	         	maxProfit = prices[i] - minSoFar;

	         }
         }
        return maxProfit;
}
}
