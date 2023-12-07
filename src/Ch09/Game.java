package Ch09;


    // Gussing the number

        // Creating a class Game
        /*
        1. Consructor to generate the random number 
        2. takeUserInput() to take input from user
        3. isCorrectNumber() to detect whether the number entered from user is correct or not
        4. Getter and Setters for numbers of guesses
        using properties such as noOfGusses()
         */
        import java.util.Scanner;

        public class Game {
            private int secretNumber;
            private int noOfGuesses;
        
        public Game() {
               secretNumber = 1 + (int)(100 * Math.random());
                noOfGuesses = 0;
            }
        
            public int getSecretNumber() {
                return secretNumber;
            }
        
            public void setSecretNumber(int secretNumber) {
                this.secretNumber = secretNumber;
            }
        
            public int getNoOfGuesses() {
                return noOfGuesses;
            }
        
            public void setNoOfGuesses(int noOfGuesses) {
                this.noOfGuesses = noOfGuesses;
            }
        
            public void takeUserInput() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Guess the number:");
                int guess = sc.nextInt();
                setNoOfGuesses(getNoOfGuesses() + 1);
                isCorrectNumber(guess);
                 // Close the Scanner after the loop
                sc.close();
            }
            
        
            public void isCorrectNumber(int guess) {
                if (guess == getSecretNumber()) {
                    System.out.println("Congratulations! You guessed the number.");
                } else {
                    System.out.println("The number is " + (guess > getSecretNumber() ? "greater" : "less") + " than " + guess);
                }
            }
            public static void main(String[] args) {
                Game game = new Game();
                while (game.getNoOfGuesses() < 5) {
                    game.takeUserInput();
                }
                if (game.getNoOfGuesses() == 5) {
                    System.out.println("You have exhausted 5 trials. The number was " + game.getSecretNumber());
                }
            }
            
        }       