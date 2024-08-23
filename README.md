# quiz_game

## Overview

The Java Quiz Game is a console-based application that allows players to answer a series of multiple-choice questions. The game tracks the player's score and provides immediate feedback on whether the answer was correct or incorrect. This project is a great way to practice Java programming, focusing on object-oriented design, input handling, and control flow.

## Features

- **Multiple Choice Questions**: Players are presented with a set of multiple-choice questions with varying options.
- **Immediate Feedback**: After each question, the player is informed whether their answer was correct or incorrect, along with the correct answer if they were wrong.
- **Score Tracking**: The game keeps track of the player's score and displays it at the end of the quiz.
- **Simple Console Interface**: The game operates in the command line, making it easy to use and understand.

## Getting Started

### Prerequisites

To run this project, you will need:

- **Java Development Kit (JDK)** installed on your machine.

### Installation

1. **Clone the Repository**:
   ```bash
   https://github.com/simran487/quiz_game
   cd quiz-game
   ```

2. **Compile the Program**:
   Compile the Java files using your preferred IDE or via the command line:
   ```bash
   javac Main.java Quiz.java Question.java
   ```

3. **Run the Program**:
   Execute the compiled `Main` class to start the quiz:
   ```bash
   java Main
   ```

### How to Play

1. The game will display a series of questions one by one.
2. Each question will have multiple answer options.
3. Enter the number corresponding to your chosen answer.
4. After submitting an answer, the game will tell you if it was correct or not.
5. The game continues until all questions have been answered.
6. At the end of the quiz, your final score will be displayed.

## Code Structure

- **Main.java**: The entry point of the application. It initializes the quiz and starts the game.
- **Quiz.java**: Manages the quiz game, handles user inputs, checks answers, and tracks the score.
- **Question.java**: Represents a single quiz question, including the question text, possible answers, and the correct answer.
