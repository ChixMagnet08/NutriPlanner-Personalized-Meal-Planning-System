import java.util.ArrayList;
import java.util.Scanner;


abstract class Meal {
    String name;
    int calories;
    int carbs;
    int protein;
    int fat;

    public Meal(String name, int calories, int carbs, int protein, int fat) {
        this.name = name;
        this.calories = calories;
        this.carbs = carbs;
        this.protein = protein;
        this.fat = fat;
    }

    public abstract void suggestMeal();

    public void displayMealDetails() {
        System.out.println("\nMeal: " + name);
        System.out.println("Calories: " + calories);
        System.out.println("Carbs: " + carbs + "g, Protein: " + protein + "g, Fat: " + fat + "g");
    }
}


class Breakfast extends Meal {
    public Breakfast(String name, int calories, int carbs, int protein, int fat) {
        super(name, calories, carbs, protein, fat);
    }

    @Override
    public void suggestMeal() {
        System.out.println("Try oatmeal, fruits, or a smoothie bowl for a healthy breakfast!");
    }
}

class Lunch extends Meal {
    public Lunch(String name, int calories, int carbs, int protein, int fat) {
        super(name, calories, carbs, protein, fat);
    }

    @Override
    public void suggestMeal() {
        System.out.println("How about grilled chicken with quinoa and veggies?");
    }
}

class Dinner extends Meal {
    public Dinner(String name, int calories, int carbs, int protein, int fat) {
        super(name, calories, carbs, protein, fat);
    }

    @Override
    public void suggestMeal() {
        System.out.println("Consider a light dinner like a salad or soup!");
    }
}

class Snack extends Meal {
    public Snack(String name, int calories, int carbs, int protein, int fat) {
        super(name, calories, carbs, protein, fat);
    }

    @Override
    public void suggestMeal() {
        System.out.println("Healthy snacks include nuts, yogurt, or fruit!");
    }
}


class User {
    String name;
    int age;
    double weight; // in kg
    double height; // in cm
    String healthGoal;
    String dietaryPreferences;

    public User(String name, int age, double weight, double height, String healthGoal, String dietaryPreferences) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.healthGoal = healthGoal;
        this.dietaryPreferences = dietaryPreferences;
    }

    public int calculateCalorieTarget() {
        double bmr = 10 * weight + 6.25 * height - 5 * age + 5; // Basic BMR formula
        if (healthGoal.equalsIgnoreCase("Weight Loss")) {
            return (int) (bmr - 500);
        } else if (healthGoal.equalsIgnoreCase("Muscle Gain")) {
            return (int) (bmr + 300);
        }
        return (int) bmr; // Maintain weight
    }

    public void displayUserInfo() {
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + ", Weight: " + weight + "kg, Height: " + height + "cm");
        System.out.println("Health Goal: " + healthGoal + ", Dietary Preferences: " + dietaryPreferences);
    }
}


class NutriPlanner {
    User user;
    ArrayList<Meal> mealPlan;

    public NutriPlanner(User user) {
        this.user = user;
        this.mealPlan = new ArrayList<>();
    }

    public void generatePlan() {
        mealPlan.add(new Breakfast("Oatmeal with Fruits", 250, 40, 10, 5));
        mealPlan.add(new Lunch("Grilled Chicken with Quinoa", 400, 45, 35, 8));
        mealPlan.add(new Dinner("Vegetable Soup with Bread", 300, 50, 10, 5));
        mealPlan.add(new Snack("Greek Yogurt with Honey", 150, 20, 8, 3));
    }

    public void viewMeals() {
        System.out.println("\nDaily Meal Plan:");
        for (Meal meal : mealPlan) {
            meal.displayMealDetails();
        }
    }

    public void trackNutrients() {
        int totalCalories = 0, totalCarbs = 0, totalProtein = 0, totalFat = 0;
        for (Meal meal : mealPlan) {
            totalCalories += meal.calories;
            totalCarbs += meal.carbs;
            totalProtein += meal.protein;
            totalFat += meal.fat;
        }
        System.out.println("\nNutritional Summary:");
        System.out.println("Calories: " + totalCalories);
        System.out.println("Carbs: " + totalCarbs + "g, Protein: " + totalProtein + "g, Fat: " + totalFat + "g");
    }
}


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

        planner.generatePlan();
        user.displayUserInfo();
        planner.viewMeals();
        planner.trackNutrients();

        scanner.close();
    }
}
