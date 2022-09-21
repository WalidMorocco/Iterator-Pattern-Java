public class MenuTestDrive {

	public static void main(String[] args) {
		PancakeHouseMenu breakfastMenu = new PancakeHouseMenu();
		DinerMenu2 lunchMenu = new DinerMenu2();
		
		Waitress1 marie = new Waitress1(breakfastMenu, null);
		Waitress2 alice = new Waitress2(null, lunchMenu);
		
		marie.printMenu();		
		alice.printMenu();
	}
}