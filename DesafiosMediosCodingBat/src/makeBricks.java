/*
We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and
big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 */

class Tijolos{
    public boolean makeBricks(int small, int big, int goal) {
        System.out.println(goal % 5 );
        if (goal > small + (5*big)) return false;
        return goal % 5 <= small; //resto da divisão por 5
    }

}
public class makeBricks {
    public static void main(String[] args) {
        Tijolos novo = new Tijolos();

        System.out.println(novo.makeBricks(3, 1, 8)); //%5 = 3
        System.out.println(novo.makeBricks(3, 1, 9) );//%5 = 4
        System.out.println(novo.makeBricks(3, 2, 10));//%5 = 0
        System.out.println(novo.makeBricks(3, 2, 9)); //%5 = 4
        System.out.println(novo.makeBricks(1, 4, 12));//%5 = 2
    }
}
