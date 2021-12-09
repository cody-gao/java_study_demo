package StringStudy;

import java.util.Map;

public class StringMain {

    public static void main(String[] args){
        //run demo,for example: java StringStudy.StringMain absdsdfdsfs ds

        String x =args[0];
        String y = args[1];
        //System.out.printf("a:%s,b:%s\n",x, y);    //debug

        //String x = "babadabadadddbadas";
        //String y = "bada";
        FindCount so = new FindCount();
        Map<String, Integer> m = so.FindCount(x,y);
        if( m.isEmpty() ){
            System.out.printf("%s中%s出现次数为0\n",x,y);
            return;
        }
        for( Map.Entry<String,Integer> entry : m.entrySet() ){
            System.out.printf("%s中"+entry.getKey()+"出现的次数为:"+entry.getValue()+"\r\n",x);
        }

    }
}
