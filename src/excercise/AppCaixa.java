package excercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class AppCaixa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf1.parse(sc.next());
		Client client = new Client(clientName, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		Order order = new Order(client, OrderStatus.valueOf(status));
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i=1; i <= n; i++) {
			System.out.println("Enter #"+ i +" item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int orderQuantity = sc.nextInt();
			sc.nextLine();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(orderQuantity, product.getPrice(), product);
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + sdf2.format(order.getMoment()));
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + order.getClient().toString());
		System.out.println("Order items:");
		for (OrderItem orderItem : order.getItems()) {
			System.out.println(orderItem.toString());
		}
		System.out.println(String.format("Total Price: $%.2f", order.total()));
		
		sc.close();
	}

}
