package pr4;

public class asn4 {
    public static void main(String[] args){
        int[][] arr = {{1,2,3}, {8,9,4}, {7,6,5}};
        snail(arr);
    }
    public static void snail(int[][] array){
        int[] snail_array = {};

        int arr_len = array.length;
        int subArr_len = array[0].length;
        int subArr_num = 0;
        int elem_num = 0;

        for (int i = 0; i < subArr_len; i++){
            System.out.println(array[subArr_num][i]);
            elem_num = i;
        }
        for ( int i = 1; i < arr_len; i++){
            System.out.println(array[i][elem_num]);
            subArr_num = i;
        }
        elem_num--;
        while (elem_num >= 0){
            System.out.println(array[subArr_num][elem_num]);
            elem_num--;
        }
        subArr_num--;
        for (int i = 0; i < arr_len - 1; i++){
            System.out.println(array[subArr_num][i]);
        }
    }
}
