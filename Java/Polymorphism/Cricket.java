// Problem on Method Overloading
class Batting{
    void play(){
        System.out.println("Sport's name: Cricket");
    }
    void play(String playername){
        System.out.println(playername + " is playing");
    }
    void play(String playername, int score){
        System.out.println(playername + " scored " + score);
    }
    double play(String playername, double strikeRate){
        System.out.println(playername + " has strike rate of " + strikeRate);
        return strikeRate;
    }
    int play(String playername, int score, int wicketsTaken){
        System.out.println(playername + " scored " + score + " and took " + wicketsTaken + " wickets");
        return score;
    }
}
class Cricket{
    public static void main(String[] args) {
        Batting ob = new Batting();
        ob.play();
        ob.play("Aditya Ghosh");
        ob.play("Aditya Ghosh", 100);
        double strikeRate = ob.play("Aditya Ghosh", 100.00);
        System.out.println("Strike Rate: " + strikeRate);
        int total = ob.play("Aditya Ghosh", 10773, 3);
        ob.play("Aditya Ghosh", 100);
        System.out.println("Total score: " + total);
    }
}