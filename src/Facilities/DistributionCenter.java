package Facilities;

import Products.BoxedMilk;
import Products.Chocolate;
import Products.Product;
import Products.Yogurt;

public class DistributionCenter {
	StorageArea storageBoxedMilk;
	StorageArea storageChocolate;
	StorageArea storageYogurt;
	public DistributionCenter() {
		storageBoxedMilk = new StorageArea();
		storageChocolate = new StorageArea();
		storageYogurt = new StorageArea();
	}
	public StorageArea getStorageBoxedMilk() {
		return storageBoxedMilk;
	}
	public StorageArea getStorageChocolate() {
		return storageChocolate;
	}
	public StorageArea getStorageYogurt() {
		return storageYogurt;
	}
	
	public void sellProduct(Product product,int amount, AccountOfCompany moneyAccount) {
		
		
		if(product instanceof BoxedMilk && storageBoxedMilk.getVolumeOfArea()>=amount) {
			int money = amount;
			moneyAccount.earnMoney(money);
			storageBoxedMilk.dellItem(amount);
		}
		else if(product instanceof Chocolate && storageChocolate.getVolumeOfArea()>=amount) {
			int money = amount*4*2;
			moneyAccount.earnMoney(money);
			storageChocolate.dellItem(amount);
		}
		else if(product instanceof Yogurt && storageYogurt.getVolumeOfArea()>=amount) {
			int money = amount*2/2;
			moneyAccount.earnMoney(money);
			storageYogurt.dellItem(amount);
		}
		
		
		
	}
	
	
	
	
	
	

}
