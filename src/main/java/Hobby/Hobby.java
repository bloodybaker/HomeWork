package Hobby;

public class Hobby {
    private int age;
    private short eloRank;
    private long numberOfWins;
    private boolean fullStamina;
    private char avaragePaceInGame;
    private byte yearsPlayed;
    private float averageWinRate;
    private double avarageLoseRate;

    public Hobby() {
    }

    public Hobby(short eloRank, float averageWinRate) {
        this.eloRank = eloRank;
        this.averageWinRate = averageWinRate;
    }

    public Hobby(boolean fullStamina, double avarageLoseRate) {
        this.fullStamina = fullStamina;
        this.avarageLoseRate = avarageLoseRate;
    }

    public int getAge() {
        return age;
    }

    public short getEloRank() {
        return eloRank;
    }

    public long getNumberOfWins() {
        return numberOfWins;
    }

    public boolean isFullStamina() {
        return fullStamina;
    }

    public char getAvaragePaceInGame() {
        return avaragePaceInGame;
    }

    public byte getYearsPlayed() {
        return yearsPlayed;
    }

    public float getAverageWinRate() {
        return averageWinRate;
    }

    public double getAvarageLoseRate() {
        return avarageLoseRate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEloRank(short eloRank) {
        this.eloRank = eloRank;
    }

    public void setNumberOfWins(long numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public void setFullStamina(boolean fullStamina) {
        this.fullStamina = fullStamina;
    }

    public void setAvaragePaceInGame(char avaragePaceInGame) {
        this.avaragePaceInGame = avaragePaceInGame;
    }

    public void setYearsPlayed(byte yearsPlayed) {
        this.yearsPlayed = yearsPlayed;
    }

    public void setAverageWinRate(float averageWinRate) {
        this.averageWinRate = averageWinRate;
    }

    public void setAvarageLoseRate(double avarageLoseRate) {
        this.avarageLoseRate = avarageLoseRate;
    }
    public void tellAboutHobby(){
        System.out.println("Хобби - шахматы");
        System.out.println("Твой возраст: " + age);
        System.out.println("Твой Win/Lose rate: " + averageWinRate + "/" + avarageLoseRate);
        System.out.println("Полон энергии для игры: " + fullStamina);
    }
}
