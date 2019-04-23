#Observer Design Pattern

Best utilised in conjunction with a many-to-one relationship.

If one object modifies a model, all other objects are notified of the update.


- Create the Model class [Subject.java]
- Create the generic, abstract Observer class [Observer.java]
- Create Observer classes that extend the abstract class [BinaryObserver.java, OctalObserver.java, HexaObserver.java]
- Driver class to test out design pattern