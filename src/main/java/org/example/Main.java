package org.example;
import java.util.Random;


public class Main {
    public static class Robot {
        String name;
        private int healthPoints;

        public Robot(String name) {
            this.name = name;
            this.healthPoints = 10;
        }

        public void fire(Robot target) {
            target.healthPoints -= 2;
            System.out.println("Robot " + this.name + " a été touché par le Robot " + target.name + " !");
        }

        public boolean isDead() {
            return healthPoints <= 0;
        }

        @Override
        public String toString() {
            return "Robot " + name;
        }
    }

    public static class Arena {
        public static Robot fight(Robot robot1, Robot robot2) {
            while (!robot1.isDead() && !robot2.isDead()) {
                robot1.fire(robot2);
                if (!robot2.isDead()) {
                    robot2.fire(robot1);
                }
            }
            return (robot1.isDead()) ? robot2 : robot1;
        }

//        public static void main(String[] args) {
//            Robot d2r2 = new Robot("D2R2");
//            Robot data = new Robot("Data");
//
//            Robot winner = fight(d2r2, data);
//            System.out.println("Le gagnant est : " + winner);
//        }
    }


    public static class Fighter extends Robot {
        private Random random;

        public Fighter(String name, long seed) {
            super(name);
            this.random = new Random(seed);
        }

        @Override
        public void fire(Robot target) {
            if (random.nextBoolean()) {
                super.fire(target);
            } else {
                System.out.println("Fighter " + this.name + " a raté sa cible !");
            }
        }

        @Override
        public String toString() {
            return "Fighter " + name;
        }
    }

}
