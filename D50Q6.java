public class D50Q6 {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        if (max < min) {
            int temp = max;
            max = min;
            min = temp;
        }

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.initializePrimeNumbers(max); //素数の最大値
        int[] part = primeNumbers.getPart(min,max);

        for (int prime : part) {
            System.out.println(prime + " ");
        }
    }
}

class PrimeNumbers{
    boolean[] isPrimeNumbers;

    void initializePrimeNumbers(int max){
        isPrimeNumbers = new boolean[max+1]; //32行目辺りでmの最大値がmaxになるから
        for(int i = 2; i <= max; i++){
            isPrimeNumbers[i] = true; //tureで初期化するからtrue入れてる
        }

        for (int p = 2; p <= Math.sqrt(max); p++){ // p=2とし、pが最大値の平方根を超えるまで繰り返す
            if(isPrimeNumbers[p]){
                for (int m = p*2; m <= max; m+=p){
                    isPrimeNumbers[m] = false;
                }
            }
        }
    }
    int[] getPart(int min, int max){ //素数判定配列から素数を抜き出し配列で返す
        int count = 0;
        for (int n = min; n<=max; n++){
            if (isPrimeNumbers[n]){ //範囲にある素数の数を返す
                count++;
            }
        }
        int[] part = new int[count]; //配列partの作成。要素数は41行目から持ってくる
        int index = 0;
        for (int n = min; n<=max; n++){
            if (isPrimeNumbers[n]){
                part[index++] = n;
            }
        }
        return part;
    }
}
