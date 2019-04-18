# The Strategy design pattern

To handle situations where different behaviours need to be assigned to an object at runtime.


- You create a Strategy interface that holds the empty method
- Create strategy files that implement the Strategy interface with the required code
- Example: Giving a different outfit option depending on the weather info given by the user
- Create a Context file that allows the program to create an instance of the required strategy