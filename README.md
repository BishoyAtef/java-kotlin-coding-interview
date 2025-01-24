# Rock Paper Scissors Game  

## Description  
This is a simple implementation of the classic "Rock, Paper, Scissors" game. The game involves two players:  
1. **Rock Player**: Always plays "Rock."  
2. **Random Player**: Plays one of "Rock," "Paper," or "Scissors" randomly.  

The game is written in **Kotlin** and employs the **Strategy Design Pattern** for flexible and scalable player behaviors. Unit tests are implemented using **Kotlin Test**.  

---

## Features  
- Two distinct player strategies:  
  - **Rock Player**: Always chooses "Rock."  
  - **Random Player**: Randomly chooses between "Rock," "Paper," or "Scissors."  
- Multiple rounds of play with automated winner determination for each round.  
- Unit testing ensures the reliability of the game's logic and strategies.  

---

## Design Pattern  
The **Strategy Design Pattern** is used to separate player behaviors, making it easy to add new strategies in the future.  

### Key Components:  
1. **PlayerStrategy Interface**: Defines the strategy for making a move (e.g., `Rock`, `Paper`, `Scissors`).  
2. **RockPlayer Class**: Implements the `PlayerStrategy` interface to always play "Rock."  
3. **RandomPlayer Class**: Implements the `PlayerStrategy` interface to play a random move.  
4. **Game Class**: Manages the game logic and determines the winner based on the players' moves.  

---

## Getting Started  

### Prerequisites  
- **Kotlin**: Ensure you have Kotlin installed.  
- **Gradle**: Required to build and run the project.  

### Running the Game  
1. Clone the repository:  
   ```bash  
   git clone <repository_url>  
   cd rock-paper-scissors  

2. Build the project
  ./gradlew build  

3. Run the game
  ./gradlew run  

### Testing
Unit tests are implemented using Kotlin Test to verify the correctness of the game's logic and player strategies.

Run Tests
    Execute the following command to run all tests: ./gradlew test  

### How to Play
The game is automated with two predefined players:

The Rock Player always plays "Rock."
The Random Player makes random choices.
Each round, the game displays:

Each player’s choice.
The winner of the round.
The outcome is determined using the standard "Rock, Paper, Scissors" rules:

Rock beats Scissors.
Scissors beat Paper.
Paper beats Rock.

### Future Enhancements
1. Add a Human Player for interactive gameplay.
2. Implement additional strategies, such as:
3. Predictive strategies based on opponent’s past moves.
4. Weighted random strategies for bias.
5. Add a graphical user interface (GUI).