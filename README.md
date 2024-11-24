# Magical Arena Game

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#Prerequisites)
- [Installation](#installation)
- [Explanation of Key Classes](#Explanation)
- [Testing Details](#Testing)

## Introduction
Magical Arena is a turn-based simulation game where two players compete using their health, strength, and attack attributes. Players take turns rolling dice to calculate attack damage and defense strength. The game continues until one player's health reaches zero, declaring the other player the winner.

This project is implemented in Java using Maven for dependency management and includes unit tests for validation.

## Features
- Turn-Based Gameplay: Players attack and defend in turns.
- Dice Mechanics: Random dice rolls determine attack damage and defense strength.
- Dynamic Match Simulation: Health is updated dynamically based on attacks and defenses.
- Unit Tests: Comprehensive unit tests ensure correctness of the game's mechanics.

## Prerequisites
- Java Development Kit (JDK): Version 8 or higher.
- Maven: Version 3.6 or higher.

## Installation

1. Compile and build the project using Maven:

``` bash
mvn clean install
```

2. Run the MagicalArena game application
3. Execute the unit tests to verify functionality
```bash
mvn test
```

## Explanation of Key Classes

1. Player.java

- Represents a player in the game.
- Key attributes: health, strength, and attack.
- Includes methods for: Calculating attack damage, defense strength, and rolling dice for randomness.
- Reducing health dynamically during gameplay.

2. MagicalArena.java
- Simulates the gameplay logic.
- Controls turn-based attacks and updates player health.
- Determines the winner and prints the match progression.

## Testing Details
### Unit Tests
The project includes unit tests for both classes:

1. PlayerTest.java: 
   - Tests player initialization, health reduction, dice rolls, and calculations.
2. MagicalArenaTest.java:
   - Tests gameplay scenarios, fight rounds, and match outcomes.

