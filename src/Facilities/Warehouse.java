package Facilities;

import java.util.Scanner;

import Ingredients.Cacao;
import Ingredients.Cream;
import Ingredients.Milk;
import Ingredients.RawMaterial;
import Ingredients.Yeast;

public class Warehouse {
	
	StorageTank storageCacao;
	StorageTank storageCream;
	StorageTank storageMilk;
	StorageTank storageYeast;
	
	
	
	public Warehouse() {
		storageCacao =new StorageTank();
		storageCream = new StorageTank();
		storageMilk = new StorageTank();
		storageYeast = new StorageTank();
	}
	

	public void setStorageCacao(StorageTank storageCacao) {
		this.storageCacao = storageCacao;
	}


	public void setStorageCream(StorageTank storageCream) {
		this.storageCream = storageCream;
	}


	public void setStorageMilk(StorageTank storageMilk) {
		this.storageMilk = storageMilk;
	}


	public void setStorageYeast(StorageTank storageYeast) {
		this.storageYeast = storageYeast;
	}


	public StorageTank getStorageCacao() {
		return storageCacao;
	}

	public StorageTank getStorageCream() {
		return storageCream;
	}

	public StorageTank getStorageMilk() {
		return storageMilk;
	}

	public StorageTank getStorageYeast() {
		return storageYeast;
	}
	
	
	
	@Override
	public String toString() {
		return "Warehouse storageCacao=" + storageCacao + ", storageCream=" + storageCream + ", storageMilk="
				+ storageMilk + ", storageYeast=" + storageYeast;
	}


	public void buyIngredients(RawMaterial ingredient,int amount, AccountOfCompany moneyAccount) {
		
		if(!IngredientsBuyer.buyIngredients(ingredient, amount, moneyAccount)) {
			
		}
		else {
			if(ingredient instanceof Cacao) {// bu kısmı da ingredients buyer da yapsam daha iyi olacak
				storageCacao.addItem(amount);
			}
			else if(ingredient instanceof Cream) {
				storageCream.addItem(amount);
			}
			else if(ingredient instanceof Milk) {
				storageMilk.addItem(amount);
			}
			else if(ingredient instanceof Yeast) {
				storageYeast.addItem(amount);
			}
		}
	}
	
}
