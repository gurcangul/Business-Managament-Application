package Facilities;


import Ingredients.Cacao;
import Ingredients.Cream;
import Ingredients.Milk;
import Ingredients.RawMaterial;
import Ingredients.Yeast;

public class IngredientsBuyer {//İtem satın almak için kullanıyorum
		
	public static boolean buyIngredients(RawMaterial ingredient,int amount, AccountOfCompany moneyAccount) {
		boolean done = false;
		double itemValue = 0;
		if(ingredient instanceof Cacao) {
			itemValue = 1;
		}
		else if(ingredient instanceof Cream) {
			itemValue = 0.30;
		}
		else if(ingredient instanceof Milk) {
			itemValue = 0.25;
		}
		else if(ingredient instanceof Yeast) {
			itemValue = 5;
		}
		double money = amount * itemValue;

		if(moneyAccount.getMoney() - money<0) {
			System.out.println("Your money is not enought to buy the ingredient");
		}
		else {
			moneyAccount.spendMoney(money);
			done = true;
		}
		return done;
	}
}
