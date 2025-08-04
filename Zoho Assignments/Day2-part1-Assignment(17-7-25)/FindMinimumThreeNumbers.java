public class FindMinimumThreeNumbers{
    public static void main(String[] args) {
        int apple=10;
        int lemon=20;
        int orange=5;
        if(apple<lemon){
            if(orange>apple)System.out.println("minimum Fruit price is "+apple);
            else System.out.println("minimum Fruit price is "+orange);
        }
        else{
            if(orange>lemon)System.out.println("minimum Fruit price is "+lemon);
            else System.out.println("minimum Fruit price is "+orange); 
        }
    }
}