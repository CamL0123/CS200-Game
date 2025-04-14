# CS200-Game
Game Theme: Escape Room.

- Map of the world: We’ll have three rooms in total, which forms a chain. When the player solves some puzzles or gets some resources they will successfully open the next room’s door. When the player opens the third room’s exit door, the player wins. 
- The characters/animals: One of these characters is another human character, who ultimately does not want the character to leave the escape room, but the player believes them to be friendly at first (because they’re the only other human being). Other 2 in the escape room are animals, and the player would be afraid of them initially: 1 snake (huge snake: 20ft long), 1 owl (also big). These characters/animals can potentially give out help/disturbance to the player.
- Items: These may include items that serve as hints or clues to open the door to next room, food to gain more life points, and keys to open doors
- Goal: The goal of the user is to successfully escape.
![IMG_2468](https://github.com/user-attachments/assets/bbe89a04-56db-4298-b069-da1287761399)

Classes needed:
- Game.java 
- Player.java 
- Room.java 
- Animal.java
  Damage: the animal will take away some health points each time the player gets a question wrong. When player health hits 0 they automatically start again at the beginning of the room.
- Animal subclass: Snake.java
- Animal subclass: Owl.java
- Animal subclass: villain.java
  For villain game: villain's name in the game is "Human" for game purposes, while its subclass name is villain.Villain asks if the player wants to leave, if player says "yes" player starts from room0. if player says "no", player fights the villain. the player wins if the player has more than 50 health points left, else starts over from room0. 
- GameGUI.java
  No longer a text-based game - will need to have buttons that control player's actions.
