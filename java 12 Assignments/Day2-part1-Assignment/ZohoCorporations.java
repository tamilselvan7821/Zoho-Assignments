public class ZohoCorporations{
    static void printZoho(String str){
        int start=0;
        int len=4;
        do{
            System.out.println(str.substring(start,len));
            start+=4;
            len+=4;
        }
        while(len<=str.length());
    }
    public static void main(String[] args) {
        String str="ZohoCorporations";
        printZoho(str);
    }
}