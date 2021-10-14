package sample;

import java.util.Arrays;

//可変長の準備
class ArraysSample{
    static int sum(int...array){
        int sum  = 0;
        for (int value:array) sum+= value;
        return sum;
    }
    public static void main(String[] args) {
        //配列のコピー
        int[] oldArray = {10,20,30};
        int[] newArray = Arrays.copyOf(oldArray,
                oldArray.length+3);
        //配列の文字列表現
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(oldArray));

        //配列のソート
        int[] array = {100,20,0,50,70};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);//自然順にソート
        System.out.println(Arrays.toString(array));

        //値の検索
        int[] array1 = {2,4,7,1,8};
        Arrays.sort(array1);//事前にソートする
        //値7を検索
        System.out.println(Arrays.binarySearch(array1,4));//1
        System.out.println(Arrays.binarySearch(array1, 3));//負の数

        //可変長引数
        System.out.println(sum(1, 2, 3, 4, 5));//10
        System.out.println(sum(10, 20));//30
    }
}