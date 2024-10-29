import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 3; // מספר המספרים הנרקיסיסטיים לחיפוש
        int[] narcissisticNumbers = findNarcissisticNumbers(n);

        // הדפסת המספרים הנרקיסיסטיים שנמצאו
        for (int num : narcissisticNumbers) {
            System.out.println(num);
        }
    }

    // פעולה למציאת n המספרים הנרקיסיסטיים הראשונים
    public static int[] findNarcissisticNumbers(int n) {
        // TODO: השלם את הלוגיקה למציאת המספרים הנרקיסיסטיים
        int nCunt = 0;
        int num = 10;
        int lenNumber =0;
        boolean isNarNum = false;
        int[] arr = new int[n];
        while(nCunt != n && nCunt <= n){
            isNarNum = checkNum(num, lenNum(num));
            if (isNarNum){
                arr[nCunt] = num;
                nCunt++;
            }
            num++;
        }
        return arr;
    }

    public static int lenNum(int num){
        int len = 0;
        int n = 10;
        while(num > 0){
            len++;
            num = num - (num % n);
            n *= 10;
        }
        return len;
    }

    public static boolean checkNum(int num, int len){
        int n = 10;
        int sum = 0;
        int fNum = num;
        for(int i = 0; i < len; i++){
            sum += (int) Math.pow((num % n), len);
            num /= 10;
        }
        //System.out.println(sum + "   num:" + fNum);
        if(sum == fNum){
            return true;
        }
        return false;
    }

}