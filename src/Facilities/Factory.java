package Facilities;

import Products.BoxedMilk;
import Products.Chocolate;
import Products.Product;
import Products.Yogurt;

public class Factory {
	
	StorageTank storageCacao;
	StorageTank storageCream;
	StorageTank storageMilk;
	StorageTank storageYeast;
	StorageArea storageBoxedMilk;
	StorageArea storageChocolate;
	StorageArea storageYogurt;
	public Factory() {
		
		storageCacao =new StorageTank();
		storageCream = new StorageTank();
		storageMilk = new StorageTank();
		storageYeast = new StorageTank();
		storageBoxedMilk = new StorageArea();
		storageChocolate = new StorageArea();
		storageYogurt = new StorageArea();
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

	public StorageArea getStorageBoxedMilk() {
		return storageBoxedMilk;
	}

	public StorageArea getStorageChocolate() {
		return storageChocolate;
	}

	public StorageArea getStorageYogurt() {
		return storageYogurt;
	}

	public void produceProduct(Product product, int amount) {
		if(product instanceof BoxedMilk) {
			ProduceProduct.produceBoxedMilk(storageMilk,amount,storageBoxedMilk);
		}
		else if(product instanceof Chocolate) {
			ProduceProduct.produceChocolate(storageMilk,storageCacao,storageCream,amount,storageChocolate);
		}
		else if(product instanceof Yogurt) {
			ProduceProduct.produceYogurt(storageMilk,storageYeast,amount,storageYogurt);
		}
		
	}
	
	
	
	
	
	

}
