package leetcode.easy;

public class LemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        int twenties = 0;

        if(bills == null || bills[0]>5){
            return false;
        }

        for(int i = 0; i<bills.length; i++){
            if(bills[i] == 5){
                fives++;
            }else if(bills[i] == 10){
                if(fives<=0) return false;
                fives--;
                tens++;
            }else if(bills[i] == 20){
                if(tens>0 && fives>0){
                    tens--;
                    fives--;
                    twenties++;
                }else if(fives>=3){
                    fives-=3;
                    twenties++;
                }else
                    return false;

            }
        }
        return true;
    }
}
