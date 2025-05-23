package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int sayi) {

        int pozitif=Math.abs(sayi); //sayinin mutlagini aldim, negatif gecersiz olacagi icin

        String stSayi=Integer.toString(pozitif); //sayiyi string'e cevirdim.

        StringBuilder sb = new StringBuilder(stSayi); //StringBuilder nesnesi olusturdum ve olusturdugum stSayi adli sayi stringini koydum

        String tersSayiStr = sb.reverse().toString(); // stringi tersine ceviriyorum ve yeni bir stringe atiyorum

        return stSayi.equals(tersSayiStr); //stringe cevirdigim ilk sayim, tersine cevirdigim stringe esitse return ediyorum.

    }

public static boolean isPerfectNumber(int number) {
     if(number<0) { //number integer'im negatifse direkt false
         return false;
     }

     int bolenToplam=0;

     for(int i=1 ; i<=number/2; i++){ //bir sayinin tam bolenleri max yarisina kadar

         if(number%i==0){
             bolenToplam +=i;
         }

     }

        if (bolenToplam==number) {
         return  true;
     }
     return  false;

}

public static  String  numberToWords(int number) {
        if(number<0) {
           return "Invalid Value";
        }
if(number==0) {
    return "Zero";

}

String result="";

String numtoString=Integer.toString(number);

for(int i=1; i<numtoString.length(); i++){

    char digit= numtoString.charAt(i);

    switch (digit) {
        case 0:
            result +="Zero";
            break;

        case 1:
            result += "One";
            break;

        case 2:
            result +="Two";
            break;

        case 3:
            result +="Three";
            break;

        case 4:
            result +="Four";
            break;

        case 5:
            result +="Five";
            break;

        case 6:
            result +="Six";
            break;

        case 7:
            result +="Seven";
            break;

        case 8:
            result +="Eight";
            break;

        case 9:
            result +="Nine";
            break;

    }


}

return result.trim();

}

}
