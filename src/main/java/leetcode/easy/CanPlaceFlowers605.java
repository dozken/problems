package leetcode.easy;

public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;
        if(flowerbed.length == 1) return flowerbed[0]==0;
        if(flowerbed.length == 2) return flowerbed[0]==0 && flowerbed[1]==0 && n==1;
        if(flowerbed.length<Math.ceil(n/2)) return false;

        for(int i=1; i<flowerbed.length; i++){
            if(i==1 && flowerbed[i-1] == 0 && flowerbed[i]==0){
                n--;
                flowerbed[i-1] = 1;
            }
            else if(i==flowerbed.length-1  && flowerbed[i-1]==0  && flowerbed[i]==0){
                flowerbed[i] = 1;
                n--;
            }
            else if((flowerbed[i-1] == 0 && flowerbed[i]==0 && flowerbed[i+1]==0)){
                n--;
                flowerbed[i]=1;
            }

        }

        int[] a = new int[0];
        assert a[-10]==1;

        return n <= 0;
    }
}
