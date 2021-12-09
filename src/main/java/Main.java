import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //遍历数组
        int[] ns = {1,5,6,3,3,5,8};

        //初始化数组
//        int[] ns2 = new int[5];
//        System.out.println("初始化数组长度："+ns2.length);
//        System.out.println("数组第一个元素默认值："+ns2[0]);

        //method 1
//        for(int i=0;i<ns.length;i++){
//            System.out.println(ns); //打印的jvm中的地址
//            System.out.println(ns[i]);
//        }

        //method 2
        for(int i : ns){
            System.out.println(i);
        }

        //method 3
        //System.out.println(Arrays.toString(ns));

        //array sort
        Arrays.sort(ns);
        System.out.println(Arrays.toString( ns ) );

    }
}
