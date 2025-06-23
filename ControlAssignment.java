public class ControlAssignment {
    public static void main(String[] args) {
        int number = 15;
        int budget = 85;
        int zodiacNumber = 3;

        checkDivisibility(number);

        recommendRide(budget);

        zodiacAnimal(zodiacNumber);
    }
    
    
    // Problem 1: Divisibility check
    public static void checkDivisibility(int number){
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5.");
        } else if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3.");
        } else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 3 or 5.");
        }

    }

    // Problem 2: What to ride based on budget
    public static void recommendRide(int budget){
        if (budget > 100) {
            System.out.println("Ride a taxi.");
        } else if (budget >= 50) {
            System.out.println("Ride a train.");
        } else if (budget >= 20) {
            System.out.println("Ride a bus.");
        } else if (budget >= 0) {
            System.out.println("Walk.");
        } else {
            System.out.println("Invalid budget.");
        }

    }

    // Problem 3: Zodiac animal using switch-case
    public static void zodiacAnimal(int zodiacNumber){
        switch (zodiacNumber) {
            case 1: System.out.println("Zodiac animal: Rat"); break;
            case 2: System.out.println("Zodiac animal: Ox"); break;
            case 3: System.out.println("Zodiac animal: Tiger"); break;
            case 4: System.out.println("Zodiac animal: Rabbit"); break;
            case 5: System.out.println("Zodiac animal: Dragon"); break;
            case 6: System.out.println("Zodiac animal: Snake"); break;
            case 7: System.out.println("Zodiac animal: Horse"); break;
            case 8: System.out.println("Zodiac animal: Goat"); break;
            case 9: System.out.println("Zodiac animal: Monkey"); break;
            case 10: System.out.println("Zodiac animal: Rooster"); break;
            case 11: System.out.println("Zodiac animal: Dog"); break;
            case 12: System.out.println("Zodiac animal: Pig"); break;
            default: System.out.println("Invalid zodiac number.");
        }
    }

}