public class Main {
    public static void main(String[] args) {

        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);
        Expression two = new NumberExpression(2);

        Expression add = new AddExpression(five, three);
        Expression result = new SubtractExpression(add, two);

        System.out.println(result.interpret()); // Output: 6
    }
}