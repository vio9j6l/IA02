import java.util.Scanner;

enum ShipmentType
{
  FEDEX,
  UPS,
  PLANTEX
}

public class Demo
{

  Scanner keyboard = new Scanner(System.in);
  Shipment shipment = new Shipment();

  public void runDemo() {
    shipment.addProduct(new Product("ea904c59-6e47-4982-b018-5ee9781e1e64", 1, "Mechanical Keyboard", 5.2));
    shipment.addProduct(new Product("58d5ac1b-417f-4843-b9c8-6b957fda61f9", 1, "Wireless Mouse", 1.3));
    shipment.addProduct(new Product("91f496f6-f6fe-4c5b-913a-810449456a50", 3, "HP Monitor", 25.1));
    shipment.addProduct(new Product("c25bee68-2b1b-4b29-afb8-885ea84f7859", 2, "Aperion Speakers", 20.8));

    System.out.println("How do you want to ship your order?");
    System.out.println("1) FedEx");
    System.out.println("2) UPS");
    System.out.println("3) Planet Express");
    String userInput = keyboard.nextLine();
    int choiceNum = Integer.parseInt(userInput);
    ShipmentType choice = ShipmentType.values()[choiceNum - 1];

    //Print out the company name based on the number being typed in
    String shipperName = null;
    FederalExpress fedex = null;
    UnitedParcelService ups = null;
    PlanetExpress plantEx = null;
    switch (choice) {
      case FEDEX:
        fedex = new FederalExpress();
        fedex.addProducts(shipment);
        shipperName = fedex.companyName();
        break;
      case UPS:
        ups = new UnitedParcelService();
        ups.addProducts(shipment);
        shipperName = ups.companyName();
        break;
      case PLANTEX:
        plantEx = new PlanetExpress();
        plantEx.addProducts(shipment);
        shipperName = plantEx.companyName();
        break;
      default:
        System.out.println("Invalid choice");
    }

    /* Use outPutProducts method from each class to get products information
     * and stored into the productList String variable
     * Then print out the list based choice
     */
    System.out.println("Your shipment is being processed by " + shipperName);
    System.out.println("Items getting ready to ship:\n");
    String productList = null;
    switch (choice) {
      case FEDEX:
        productList = fedex.outPutProducts();
        break;
      case UPS:
        productList = ups.outPutProducts();
        break;
      case PLANTEX:
        productList = plantEx.outPutProducts();
        break;
      default:
        throw new AssertionError();
    }
    System.out.println(productList);

  }

}

