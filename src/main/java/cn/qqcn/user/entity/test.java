package cn.qqcn.user.entity;

import org.junit.jupiter.api.Test;

public class test {

    @Test
    public void test(){
        String reuslt = numElement("CaCO");
        System.out.println(reuslt);
    }

    public String numElement(String element){

        char aa;
        char nn='1';
        char ll;
        String bb="";
        String element1="";
        char []elementCharArray=element.toCharArray();
        //int i = 0, j = 0; i < a && j < b; i++, j++
        for(int i=0;i<elementCharArray.length;){
            if(elementCharArray[i]>=65 && elementCharArray[i]<=90){

                aa=elementCharArray[i];
                bb=String.valueOf(aa);  //大写字母
                //element1+=bb;
                i++;
                /*if(i==elementCharArray.length-1){
                    break;
                }*/
                if(i>elementCharArray.length-1){
                    element1+=bb+"1";
                }

                if(i==elementCharArray.length){
                    break;
                }
                if(elementCharArray[i]>=97 && elementCharArray[i]<=122){

                    //小写或数字
                    char uu=elementCharArray[i];
                    String kk=String.valueOf(uu);
                    //String mm=String.valueOf(nn);
                    element1+=bb+kk;
                    i++;
                    /*if(i==elementCharArray.length-1){
                        break;
                    }*/
                    if(!(elementCharArray[i+1]>=65 && elementCharArray[i+1]<=90)){
                        char pp=elementCharArray[i+1];
                        String zz=String.valueOf(pp);
                        element1+=bb+kk+zz;
                        //element1+=zz;
                    }else {
                        element1+="1";
                        /*if(i==elementCharArray.length-1){
                            break;
                        }*/
                        //element1+="1";
                    }
                }/*else if(!(elementCharArray[j]>=65 && elementCharArray[j]<=90)&&(!(elementCharArray[j]>=97 && elementCharArray[j]<=122))){
                    ll=elementCharArray[j];
                    String mm=String.valueOf(ll);
                    element1+=bb+mm;
                }*/else if((!(elementCharArray[i]>=97 && elementCharArray[i]<=122))&&(!(elementCharArray[i]>=65 && elementCharArray[i]<=90))){
                    char tt=elementCharArray[i];
                    String ee=String.valueOf(tt);
                    element1+=bb+ee;
                    if(i==elementCharArray.length){
                        break;
                    }
                }else {
                    element1+=bb+"1";
                    }
                }


            }



        return element1;
    }
}
