// Breakfast Subclass
class Breakfast extends Meal {
    public Breakfast(String name, int calories, int carbs, int protein, int fat) {
        super(name, calories, carbs, protein, fat);
    }

    @Override
    public void suggestMeal() {
        System.out.println("Try oatmeal, fruits, or a smoothie bowl for a healthy breakfast!");
    }
}
