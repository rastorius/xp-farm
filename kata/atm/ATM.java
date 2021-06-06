public class ATM {

  final static int[] bills = {500, 200, 100, 50, 20, 10}; 

  public int solve(int n) {
    int counter = 0;
    for(int bill: bills) {
      if(n >= bill) {
        counter += n / bill;
        n = n % bill;
      }
    }
    return n == 0 ? counter : -1; 
  }
}