import java.util.ArrayList;

public class Waitress1 {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu1 dinerMenu;
	
	public Waitress1(PancakeHouseMenu pancakeHouseMenu, DinerMenu1 dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	void printMenu() {
		Iterator dinerIterator = pancakeHouseMenu.createIterator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}