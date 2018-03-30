package com.info.arusha;

import javax.print.DocFlavor.CHAR_ARRAY;

public class testscania {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="1,234";
		String b="1,234 abcd";
		System.out.println(Integer.parseInt(a.replace(",","")));
        System.out.println(b.getBytes());
        CharSequence c;
        StringBuilder c1=new StringBuilder();
        for(int i = 0; i < b.length(); i++){
            final char c2 = b.charAt(i);
            if(c2 > 47 && c2 < 58){
                c1.append(c2);
            }
        }
        
        System.out.println(c1.toString());
        
        
        
        

	}

}
