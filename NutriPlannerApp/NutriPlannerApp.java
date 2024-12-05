import java.util.Scanner;

// Main Class
public class NutriPlannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (cm): ");
        double height = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter your health goal (Weight Loss/Muscle Gain/Maintain): ");
        String healthGoal = scanner.nextLine();

        System.out.print("Enter your dietary preferences (e.g., Vegetarian, Low-Carb): ");
        String dietaryPreferences = scanner.nextLine();

        User user = new User(name, age, weight, height, healthGoal, dietaryPreferences);
        NutriPlanner planner = new NutriPlanner(user);

        // Generate and Display Meal Plan
        planner.generatePlan();
        user.displayUserInfo();
        planner.viewMeals();
        planner.trackNutrients();

        scanner.close();
    }
}
