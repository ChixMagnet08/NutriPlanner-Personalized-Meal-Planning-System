// Dinner Subclass
class Dinner extends Meal {
    public Dinner(String name, int calories, int carbs, int protein, int fat) {
        super(name, calories, carbs, protein, fat);
    }

    @Override
    public void suggestMeal() {
        System.out.println("Consider a light dinner like a salad or soup!");
    }
}
