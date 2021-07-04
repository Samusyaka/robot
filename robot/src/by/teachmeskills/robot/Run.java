package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SkolkovoHand;
import by.teachmeskills.robot.heads.IntegralHead;
import by.teachmeskills.robot.heads.SkolkovoHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.legs.IntegralLeg;
import by.teachmeskills.robot.legs.SonyLeg;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot robotIntegral = new Robot(new IntegralHead(10), new SkolkovoHand(20), new SonyLeg(30));
        Robot robotSony = new Robot( new SonyHead(50), new SkolkovoHand(20), new SonyLeg(30));
        Robot robotSkolkovo = new Robot( new SkolkovoHead(70), new SkolkovoHand(20), new IntegralLeg(30));


        robotIntegral.action();
        System.out.println("_______________________");
        robotSony.action();
        System.out.println("_______________________");
        robotSkolkovo.action();
        System.out.println("_______________________");

        List<Robot> robots = new ArrayList<>();
        robots.add(robotIntegral);
        robots.add(robotSony);
        robots.add(robotSkolkovo);

        int maxPrice = 0;
for (int i = 0; i < robots.size(); i ++){
    if(robots.get(i).getPrice() > maxPrice)
        maxPrice = robots.get(i).getPrice();
}
        System.out.println(maxPrice);

    }
}