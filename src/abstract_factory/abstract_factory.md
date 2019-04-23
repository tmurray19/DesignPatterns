#Abstract factory design pattern

Allows you to create other factories within a factory design pattern.

The method for creating a Factory Design Pattern and an Abstract Factory Design Pattern are very similar.

- Create an interface for the method(s) [Shape.java]
- Create classes to implement the interface method(s) [Square.java, RoundedSquare.java, Circle.java, Oval.java]
- Create an abstract AbstractFactory class to get factories for the rounded and normal shapes [AbstractFactory.java]
- Create Factory classes extending the AbstractFactory class to retrieve the shape classes [ShapeFactory.java, RoundedShapeFactory.java]
- Create a Factory Generator class, that allows you to pick what Factory to create the shape classes [FactoryCreator.java]