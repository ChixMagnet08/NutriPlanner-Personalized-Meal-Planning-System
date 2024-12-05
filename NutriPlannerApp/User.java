// User Class
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
