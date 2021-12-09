package StringStudy;

import java.util.HashMap;
import java.util.Map;

public class FindCount {
    /**
     *
     * @param x 查找的源字符串
     * @param y 要查找的目标字符串
     * @return Map<String, Integer> 要查找的字符串出现次数的集合
     */
    public Map<String, Integer> FindCount(String x, String y){
        //查找字符串a中是否包含子串b,计算出现的次数
        Map<String, Integer> m = new HashMap<String,Integer>();
        if(x.length()<=0 || y.length()<=0){
            try {
                throw new Exception("string a or b length validation failed");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(x==y){ return m;}

        if(x.length()<y.length()) { return m;}

        //x、y不相等，且x长度大于y
        return containsCount(x, y);

    }

    private Map<String,Integer> containsCount(String x, String y) {
        Map<String,Integer> m = new HashMap<String, Integer>();
        for(int i=0;i<x.length()-y.length()+1;i++){ //参与对比的子串个数为两个子串长度差+1
                String tmp = x.substring(i,i+y.length());
            boolean has = tmp.equals(y);
//            System.out.printf("子串%s和查找目标子串%s,对比结果%s\n",tmp,y,String.valueOf(has));
            if( has ){
                if( m.containsKey(tmp) ){
                    m.put(tmp,m.get(tmp)+1);
                }else{
                    m.put(tmp,1);
                }
            }
        }

        return m;
    }
}
