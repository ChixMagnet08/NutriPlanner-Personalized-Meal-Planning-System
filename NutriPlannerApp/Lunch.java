// Lunch Subclass
class Lunch extends Meal {
    public Lunch(String name, int calories, int carbs, int protein, int fat) {
        super(name, calories, carbs, protein, fat);
    }

    @Override
    public void suggestMeal() {
        System.out.println("How about grilled chicken with quinoa and veggies?");
    }
}
