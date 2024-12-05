// Abstract Parent Class
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
