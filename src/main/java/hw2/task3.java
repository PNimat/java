package hw2;

public class task3 {
    public static void main(String[] args) {
        int[] posl = {1, 2, 3, 4, 5};
        boolean res = true;
        for (int i = 0; i < posl.length; i++) {
            for (int j=i+1; j<posl.length; j ++){
                if ( posl[i] > posl[j]){
                    res = false;
                }
            }
        }
        System.out.println(res);
    }
}
