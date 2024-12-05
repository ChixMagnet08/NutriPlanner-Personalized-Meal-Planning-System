import java.util.ArrayList;

// NutriPlanner Class
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
