public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private double weight;

    private final static int METHODS = 5;
    private static int count;

    public Kotik(String name, String voice, int satiety, double weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public Kotik() {
        count++;
    }

    //play (играть), sleep (спать), wash (умываться), walk (гулять), hunt (охотиться)
    public boolean play() {
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик играет");
            return true;
        } else {
            System.out.println("Котик хочет есть! Покорми его!");
            return false;
        }

    }

    public boolean sleep() {
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик спит");
            return true;
        } else {
            System.out.println("Котик хочет есть! Покорми его!");
            return false;
        }

    }

    public boolean wash() {
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик умывается");
            return true;
        } else {
            System.out.println("Котик хочет есть! Покорми его!");
            return false;
        }

    }

    public boolean walk() {
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик гуляет");
            return true;
        } else {
            System.out.println("Котик хочет есть! Покорми его!");
            return false;
        }

    }

    public boolean hunt() {
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик охотится");
            return true;
        } else {
            System.out.println("Котик хочет есть! Покорми его!");
            return false;
        }

    }

    public void eat(int UnitsOfSatiety) {
        this.satiety += UnitsOfSatiety;
    }

    public void eat(int UnitsOfSatiety, String foodName) {
        this.satiety += UnitsOfSatiety;
    }

    public void eat() {
        eat(2, "Dreamis");
    }

    public String[] liveAnotherDay() {
        String[] activities = new String[24];
        boolean checkAction = false;
        String action = "ел";
        for (int i = 0; i < 24; i++) {
            switch ((int) (Math.random() * METHODS) + 1) {
                case 1:
                    checkAction = play();
                    action = "играл";
                    break;
                case 2:
                    checkAction = sleep();
                    action = "спал";
                    break;
                case 3:
                    checkAction = wash();
                    action = "мылся";
                    break;
                case 4:
                    checkAction = walk();
                    action = "гулял";
                    break;
                case 5:
                    checkAction = hunt();
                    action = "охотился";
                    break;

            }
            if (!checkAction) {
                eat(3);
                activities[i] = i + " - ел";
            } else {
                activities[i] = i + " - " + action;
            }
        }
        return activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Kotik.count = count;
    }
}
