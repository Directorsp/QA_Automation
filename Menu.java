package takeout;

import takeout.utils.PrintUtils;

public class Menu {
    MainDish beef = new MainDish("Beef Wellington: ", 13.0D);
    MainDish fish = new MainDish("Misso Salmon: ", 12.0D);
    MainDish chicken = new MainDish("Chicken: ", 7.0D);
    MainDish pork = new MainDish("Honey Garlic Pork Chops: ", 10.0D);
    Side rice = new Side("Brown Rice: ", 2.99D);
    Side asparagus = new Side("Oven-Roasted Asparagus: ", 4.5D);
    Side beens = new Side("Green Beans Amandine: ", 5.0D);
    Side potato = new Side("Creamy Mashed Potatoes: ", 4.0D);
    Drink water = new Drink("Perrier carbonated mineral water: ", 3.5D);
    Drink wineWhite = new Drink("Oaked Chardonnay: ", 20.5D);
    Drink wineRed = new Drink("Chateau Corton Grancey Grand Cru: ", 40.0D);
    Drink juiceApple = new Drink("Fresh squeezed Apple juice: ", 10.0D);
    MainDish[] mainDishes;
    Side[] sides;
    Drink[] drinks;
    String[] mainDishesNames;
    double[] mainDishesPrices;

    public Menu() {
        this.mainDishes = new MainDish[]{this.beef, this.fish, this.chicken, this.pork};
        this.sides = new Side[]{this.rice, this.asparagus, this.beens, this.potato};
        this.drinks = new Drink[]{this.water, this.wineRed, this.wineWhite, this.juiceApple};
        this.mainDishesNames = this.getMainDishesNames();
        this.mainDishesPrices = this.getMainDishesPrices();
    }

    public MainDish getBeef() {
        return this.beef;
    }

    public void setBeef(MainDish beef) {
        this.beef = beef;
    }

    public MainDish getFish() {
        return this.fish;
    }

    public void setFish(MainDish fish) {
        this.fish = fish;
    }

    public MainDish getChicken() {
        return this.chicken;
    }

    public void setChicken(MainDish chicken) {
        this.chicken = chicken;
    }

    public MainDish getPork() {
        return this.pork;
    }

    public void setPork(MainDish pork) {
        this.pork = pork;
    }

    public Side getRice() {
        return this.rice;
    }

    public void setRice(Side rice) {
        this.rice = rice;
    }

    public Side getAsparagus() {
        return this.asparagus;
    }

    public void setAsparagus(Side asparagus) {
        this.asparagus = asparagus;
    }

    public Side getBeens() {
        return this.beens;
    }

    public void setBeens(Side beens) {
        this.beens = beens;
    }

    public Side getPotato() {
        return this.potato;
    }

    public void setPotato(Side potato) {
        this.potato = potato;
    }

    public Drink getWater() {
        return this.water;
    }

    public void setWater(Drink water) {
        this.water = water;
    }

    public Drink getWineWhite() {
        return this.wineWhite;
    }

    public void setWineWhite(Drink wineWhite) {
        this.wineWhite = wineWhite;
    }

    public Drink getWineRed() {
        return this.wineRed;
    }

    public void setWineRed(Drink wineRed) {
        this.wineRed = wineRed;
    }

    public Drink getJuiceApple() {
        return this.juiceApple;
    }

    public void setJuiceApple(Drink juiceApple) {
        this.juiceApple = juiceApple;
    }

    public String[] getMainDishesNames() {
        String[] mainDishesNames = new String[this.mainDishes.length];

        for(int i = 0; i < this.mainDishes.length; ++i) {
            mainDishesNames[i] = this.sides[i].getSideName();
        }

        return mainDishesNames;
    }

    public double[] getMainDishesPrices() {
        double[] mainDishesPrices = new double[this.mainDishes.length];

        for(int i = 0; i < this.mainDishes.length; ++i) {
            mainDishesPrices[i] = this.mainDishes[i].getMainDishPrice();
        }

        return mainDishesPrices;
    }

    public String[] getSidesNames() {
        String[] sidesNames = new String[this.sides.length];

        for(int i = 0; i < this.sides.length; ++i) {
            sidesNames[i] = this.sides[i].getSideName();
        }

        return sidesNames;
    }

    public double[] getSidesPrices() {
        double[] sidesPrices = new double[this.sides.length];

        for(int i = 0; i < this.sides.length; ++i) {
            sidesPrices[i] = this.sides[i].getSidePrice();
        }

        return sidesPrices;
    }

    public String[] getDrinksNames() {
        String[] drinksNames = new String[this.drinks.length];

        for(int i = 0; i < this.drinks.length; ++i) {
            drinksNames[i] = this.drinks[i].getDrinkName();
        }

        return drinksNames;
    }

    public double[] getDrinksPrices() {
        double[] drinksPrices = new double[this.drinks.length];

        for(int i = 0; i < this.drinks.length; ++i) {
            drinksPrices[i] = this.drinks[i].getDrinkPrice();
        }

        return drinksPrices;
    }

    private void printMainDishes() {
        PrintUtils.printMainDishesTitle();

        for(int i = 0; i < this.getMainDishesNames().length; ++i) {
            PrintUtils.print(this.mainDishesNames[i]);
            PrintUtils.printSpacesAfterName(PrintUtils.spacesAfterName(this.mainDishesNames, this.getSidesNames(), this.getDrinksNames(), this.mainDishesNames[i]));
            PrintUtils.printPrice(this.mainDishesPrices[i]);
            PrintUtils.println();
        }

        PrintUtils.println();
    }

    private void printSides() {
        PrintUtils.printSideTitle();

        for(int i = 0; i < this.getSidesNames().length; ++i) {
            PrintUtils.print(this.getSidesNames()[i]);
            PrintUtils.printSpacesAfterName(PrintUtils.spacesAfterName(this.mainDishesNames, this.getSidesNames(), this.getDrinksNames(), this.getSidesNames()[i]));
            PrintUtils.printPrice(this.getSidesPrices()[i]);
            PrintUtils.println();
        }

        PrintUtils.println();
    }

    private void printDrinks() {
        PrintUtils.printDrinksTitle();

        for(int i = 0; i < this.getDrinksNames().length; ++i) {
            PrintUtils.print(this.getDrinksNames()[i]);
            PrintUtils.printSpacesAfterName(PrintUtils.spacesAfterName(this.mainDishesNames, this.getSidesNames(), this.getDrinksNames(), this.getDrinksNames()[i]));
            PrintUtils.printPrice(this.getDrinksPrices()[i]);
            PrintUtils.println();
        }

        PrintUtils.println();
    }

    public void printMenu() {
        PrintUtils.printMenuTitle();
        this.printMainDishes();
        this.printSides();
        this.printDrinks();
        PrintUtils.println();
        PrintUtils.printLine();
    }
}
