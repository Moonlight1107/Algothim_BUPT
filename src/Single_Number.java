import java.util.Scanner;

public class Single_Number {

    public static int onceNum(int[] arr,int k){
        int[] e0 = new int[32];
        for (int i = 0; i != arr.length ; i++) {
            setExclusiveOr(e0,arr[i],k);
        }
        int res = getNumFromKSysNum(e0,k);
        return res;
    }

    public static void setExclusiveOr(int[] e0,int value,int k){
        int[] curKSysNum = getKSysNumFromNum(value,k);
        for (int i = 0; i != e0.length ; i++) {
            e0[i] = (e0[i]+curKSysNum[i]) % k;
        }
    }

    public static int[] getKSysNumFromNum(int value,int k ){
        int[] res = new int[32];
        int index = 0;
        while(value != 0){
            res[index++] = value % k;
            value = value / k;
        }
        return  res;
    }

    public static int getNumFromKSysNum(int[] e0, int k) {
        int res = 0;
        for (int i = e0.length-1;i!=-1;i--){
            res = res*k + e0[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(onceNum(arr,3));
    }
}
