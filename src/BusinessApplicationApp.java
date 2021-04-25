import java.util.InputMismatchException;
import java.util.Scanner;

import Facilities.AccountOfCompany;
import Facilities.DistributionCenter;
import Facilities.Factory;
import Facilities.Warehouse;
import Ingredients.Cacao;
import Ingredients.Cream;
import Ingredients.Milk;
import Ingredients.RawMaterial;
import Ingredients.Yeast;
import Products.BoxedMilk;
import Products.Chocolate;
import Products.Product;
import Products.Yogurt;

public class BusinessApplicationApp {
	public static void main(String[] args) {
		AccountOfCompany moneyAccount = new AccountOfCompany();
		RawMaterial cacao = new Cacao();
		RawMaterial cream = new Cream();
		RawMaterial milk = new Milk();
		RawMaterial yeast = new Yeast();
		Product boxedMilk = new BoxedMilk();
		Product chocolate = new Chocolate();
		Product yogurt = new Yogurt();
		
		Warehouse warehouse = new Warehouse();
		Factory factory = new Factory();
		DistributionCenter distributionCenter = new DistributionCenter();
		
		
		System.out.println("Welcome To Business Application Program!");
		System.out.println("Here you can buy ingredients to produce product\n"
				+"Then you can sell the product\n"
				+"Also you can ship items between facilities");
		
		System.out.println("------------------------------------------");
		String message = 	"1) To buy ingredients\n"+
				"2) To ship ingredients to Factory\n"+
				"3) To produce product with ingredients\n"+
				"4) To ship products to Distribution Center\n"+
				"5) To sell products\n"+
				"0) To exit";
		
		System.out.println("-----------------------------------------");
		Scanner scanner = new Scanner(System.in);
		boolean done = false;
		while(!done) {
			System.out.println(message);		
			System.out.println("-----------------------------------------");

			String move = scanner.nextLine();
			
			switch (move) {
				case "0":
					done = true;
					break;
			
				case "1":
					System.out.println("Please enter a ingredient name for buy (milk, cacao, cream, yeast)");
					String kind = scanner.nextLine();kind = kind.toLowerCase();
					System.out.println("Please how much ingredients you want to buy.");
					int amount=0;
					try{
						amount = scanner.nextInt();
					}catch (InputMismatchException e) {
						System.out.println("Entered invalid amount of ingredients");
					}
					if(kind.equals("milk")) {
						warehouse.buyIngredients(milk,amount,moneyAccount);
					}
					else if(kind.equals("cacao")) {
						warehouse.buyIngredients(cacao,amount,moneyAccount);				
					}
					else if(kind.equals("cream")) {
						warehouse.buyIngredients(cream,amount,moneyAccount);				
					}
					else if(kind.equals("yeast")) {
						warehouse.buyIngredients(yeast,amount,moneyAccount);				
					}
					System.out.println(warehouse);
					System.out.println(moneyAccount);
					
					
					break;
				case "2":
					
					
					break;
				case "3":
					System.out.println("Please enter a product name for sell (boxedmilk, chocolate, yogurt)");
					String kind3 = scanner.nextLine();kind3 = kind3.toLowerCase();
					System.out.println("Also enter  how much ingredients you want to buy.");
					int amount3 = 0;
					try{
						amount3 = scanner.nextInt();
					}catch (InputMismatchException e) {
						System.out.println("Entered invalid amount of ingredients");
					}
					if(kind3.equals("boxedmilk")) {
						factory.produceProduct(boxedMilk, amount3);
					}
					else if(kind3.equals("chocolate")) {
						factory.produceProduct(chocolate, amount3);
					}
					else if(kind3.equals("yogurt")) {
						factory.produceProduct(yogurt, amount3);
					}
					break;
				case "4":
					
					break;
				case "5":
					System.out.println("Please enter a product name for sell (boxedmilk, chocolate, yogurt)");
					String kind2 = scanner.nextLine();
					kind2 = kind2.toLowerCase();
					System.out.println("Also enter  how much ingredients you want to buy.");
					int amount2 = 0;
					try{
						amount2 = scanner.nextInt();
					}catch (InputMismatchException e) {
						System.out.println("Entered invalid amount of ingredients");
					}
					if(kind2.equals("boxedmilk")) {
						distributionCenter.sellProduct(boxedMilk , amount2, moneyAccount);
					}
					else if(kind2.equals("chocolate")) {
						distributionCenter.sellProduct(chocolate , amount2, moneyAccount);
					}
					else if(kind2.equals("yogurt")) {
						distributionCenter.sellProduct(yogurt , amount2, moneyAccount);
					}
					break;
				
			}
		}


		/*String kind = "cacao";
		int amount = 10;
		if(kind.equals("cacao"))
			warehouse.buyIngredients(cacao,amount,moneyAccount);
			warehouse.storeItem(cacao,storageCacao);
		

		
		System.out.println(storageCacao);
		System.out.println(moneyAccount);
		 */	
	}
	

}
