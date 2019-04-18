# The composite design pattern

For hierarchical design structures. Implements DRY principle.
e.g. You create a factory that makes parts, and you wish to add up the cost of all the parts.
Some have factories that make parts, and some have factories within these factories that make parts.
Composite works well for an example such as this.

- Create a basic interface 'component'
- Create 'leafs' of the base component
- Then write the composite element