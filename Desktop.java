package week3.day2;

public class Desktop implements Software {

	public void hardwareResource() {
		// TODO Auto-generated method stub
		System.out.println("hardware is used to desktop");
	}

	public void softwareResource() {
		// TODO Auto-generated method stub
		System.out.println("software to work in desktop");
		
	}
	public void desktopModel() {
		System.out.println("desktop model is lenovo");
	}
	//override
	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.hardwareResource();
		dt.softwareResource();
		dt.desktopModel();
	}

}
