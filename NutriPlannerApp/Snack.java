// Snack Subclass
class Snack extends Meal {
    public Snack(String name, int calories, int carbs, int protein, int fat) {
        super(name, calories, carbs, protein, fat);
    }

    @Override
    public void suggestMeal() {
        System.out.println("Healthy snacks include nuts, yogurt, or fruit!");
    }
}
