/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Student
 */
public class Cities2018 {
    private Map<String,List<String>> provinces = new HashMap();
    
    public Cities2018(){
        List<String> list1 = new ArrayList();
        list1.add("Elblag");
        list1.add("Olsztyn");
        provinces.put("warminsko-mazurskie", list1);
        List<String> list2 = Array.asList("Gdansk","Sopot","Gdynia");
        provinces.put("pomorskie", list2);      
    }
    public static void main(String[] args)
    {
        Cities2018 c = new Cities();
        System.out.println(c.provinces);
    }
}
