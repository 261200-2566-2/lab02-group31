import java.util.Scanner;
public class AirPurify {
    // class variables
    boolean power;
    String model, serialNo;
    int levelFan;
    static int modelCount;

    // class methods
    void turnOn() {
        this.power = true;              // instance variables
        levelFan = 1;
        System.out.println("Power On");

    }
    void Level(int levelFan){
        this.levelFan = levelFan;       // instance variables
        System.out.println("Current levelFan is number = " + levelFan);
        if(levelFan > 3 || levelFan <= 0){
            System.out.println("Sorry, I do not have that level");
        }

    }

    void turnOff() {
        power = false;
        System.out.println("Power Off");
    }

    AirPurify(String model, String serialNo) {
        this.model = model;             // instance variables
        this.serialNo = serialNo;       // instance variables
        modelCount++;
        System.out.println("total model = " + AirPurify.modelCount + " model");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your model: ");
        String model = s.nextLine();
        System.out.println("Enter your serialNo: ");
        String serialNo = s.nextLine();
        AirPurify a = new AirPurify(model, serialNo);           // instance variables
        System.out.println("Do you want to turn on?(Y / N)");
        String Answer = s.nextLine();

        if(Answer.equals("Y")){
            a.turnOn();
            System.out.println("levelFan (1 / 2 / 3)");
            Scanner aa = new Scanner(System.in);
            int AnsOne = aa.nextInt();
            a.Level(AnsOne);
            if(AnsOne > 0 && AnsOne <= 3) {

                System.out.println("Do you satisfied with this levelFan? (Y / N)");
                Scanner bb = new Scanner(System.in);
                String AnsTwo = bb.nextLine();

                while (AnsTwo.equals("N")) {
                    System.out.println("levelFan (1 / 2 / 3)");
                    Scanner dd = new Scanner(System.in);
                    int AnsThree = dd.nextInt();
                    a.Level(AnsThree);
                    if(AnsThree > 0 && AnsThree <= 3){
                        System.out.println("Do you satisfied with this levelFan? (Y / N)");
                        Scanner ee = new Scanner(System.in);
                        String AnsFive = ee.nextLine();
                        if (AnsFive.equals("Y")) {
                            break;
                        }
                    }
                }
                System.out.println("I'm happy that you like it");

                System.out.println("Do you want to turn off?(Y / N)");
                Scanner cc = new Scanner(System.in);
                String AnsFour = cc.nextLine();
                if (AnsFour.equals("Y")) {
                    a.turnOff();       // instance methods
                }
            }
        }
    }
}

/*
    References :
    1. http://project-programming.blogspot.com/2013/11/java-programming-8.html
    2. 261200 lec02_ Objects and Values.pdf
    3. https://home.kapook.com/view190206.html
 */