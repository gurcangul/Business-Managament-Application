package Facilities;


public class ProduceProduct {

	public static void produceBoxedMilk(StorageTank storageMilk, int amount, StorageArea storageBoxedMilk) {
		if(storageMilk.getVolume()<amount) {
			System.out.println("You cannot produce so much product. You have " + storageMilk.getVolume() + "L milk");
		}
		else if(!storageBoxedMilk.addItem(amount)) {
			System.out.println("Your storage is full");
		}
		else {
			storageMilk.delItem(amount);
			storageBoxedMilk.addItem(amount);
		}
		
		
		
	}

	public static void produceChocolate(StorageTank storageMilk, StorageTank storageCacao, StorageTank storageCream,
			int amount, StorageArea storageChocolate) {

		if(storageMilk.getVolume()*(5/8)<amount || storageCacao.getVolume()/4<amount || storageCream.getVolume()*(3/8)<amount) {
			System.out.println("You cannot produce so much product. You have " + storageMilk.getVolume() + "L milk "
					+storageCacao.getVolume() +"L cacao " + storageCream.getVolume() + "L cream");
		}
		else if(!storageChocolate.addItem(amount)) {
			System.out.println("Your storage is full");
		}
		else {
			storageMilk.delItem(amount*(5/8));
			storageCacao.delItem(amount/4);
			storageCream.delItem(amount*(3/8));
			storageChocolate.addItem(amount);
		}
		
		
	}

	public static void produceYogurt(StorageTank storageMilk, StorageTank storageYeast, int amount,
			StorageArea storageYogurt) {
		
		if(storageMilk.getVolume()*(15/14)<amount || storageYeast.getVolume()*(1/14)<amount) {
			System.out.println("You cannot produce so much product. You have " + storageMilk.getVolume() + "L milk "
					+storageYeast.getVolume() +"L yeast ");
		}
		else if(!storageYogurt.addItem(amount)) {
			System.out.println("Your storage is full");
		}
		else {
			storageMilk.delItem(amount*(15/14));
			storageYeast.delItem(amount/14);
			storageYogurt.addItem(amount);
		}
		
		
		
	}
}
