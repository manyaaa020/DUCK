Duck Behavior Simulation

Description

This Java program demonstrates the behavior of different types of ducks using the Strategy Design Pattern. It defines various swimming and flying behaviors that can be assigned dynamically to different duck types. The program follows object-oriented principles such as inheritance, abstraction, and interfaces.

Features

Implements SwimBehavior and FlyBehavior as interfaces.

Provides different behaviors:

Swimming: Swim, Float, Drown

Flying: Fly, NotFly

Implements an abstract Duck class that delegates behavior to swim and fly behaviors.

Creates concrete duck types:

MallardDuck

RubberDuck

DecoyDuck

Uses composition to dynamically assign behaviors to ducks.

Demonstrates polymorphism and dynamic behavior assignment.

Class Structure

Interfaces:

SwimBehavior → Defines swim() method

FlyBehavior → Defines fly() method

Concrete Behavior Implementations:

Swim → Implements SwimBehavior

Float → Implements SwimBehavior

Drown → Implements SwimBehavior

Fly → Implements FlyBehavior

NotFly → Implements FlyBehavior

Abstract Duck Class:

Duck → Defines performSwim(), performFly(), and display()

Duck Types:

MallardDuck → Swims and flies

RubberDuck → Floats and doesn't fly

DecoyDuck → Sinks and doesn't fly
