package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
    	if("앱".equals(str)){
            appstart();
        }else{
            super.execute(str);
        }
        
    }
 
    //메소드작성
    protected void appstart(){
        System.out.println("앱실행");
    }
    //메소드작성
    
    
    
}
