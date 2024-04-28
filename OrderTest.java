public class OrderTest {

    public static void main(String[] args) {
      TotalCalculator total = new OrderAction();  
      OrderGenerator order = new OrderAction();
      InvoiceGenerator Invoice = new OrderAction();
      EmailNotifacation Email = new OrderAction();

      total.calculateTotal(10.0, 2);
      order.placeOrder("John Doe", "123 Main St");
      Invoice.generateInvoice("order_123.pdf");
      Email.sendEmailNotification("johndoe@example.com");
    }
  }