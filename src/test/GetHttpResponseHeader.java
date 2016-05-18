package test;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
     
public class GetHttpResponseHeader {
     
  public static void main(String[] args) {
     
        try {
        	for(int i=0;i<10;i++){
                URL obj = new URL("http://tv.api.cp61.ott.cibntv.net/carousel/tvprogram?version=3.1.24&token=VoIhHSkPxY89EkWCthChfQ==&vid=42&start=-1&end=1&count=1000");
                URLConnection conn = obj.openConnection();
                Map<String, List<String>> map = conn.getHeaderFields();
     
                System.out.println("显示响应Header信息...\n");
     
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        System.out.println("Key : " + entry.getKey() + 
                                           " ,Value : " + entry.getValue());
                }
     
                System.out.println("\n使用key获得响应Header信息 \n");
                List<String> server = map.get("Server");
     
                if (server == null) {
                        System.out.println("Key 'Server' is not found!");
                } else {
                        for (String values : server) {
                                System.out.println(values);
                        }
                }
        	}
     
        } catch (Exception e) {
                e.printStackTrace();
        }
     
  }
     
}