import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// takes apart information in items purchased file "itemsbeforetax.txt" and converts the string data into integer for calculating tax via regex
public class ReceiptInputItems {
    private Purchase purchase;
    public ReceiptInputItems(String shoppingbasket) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(shoppingbasket));
            String itemDetails;
            this.purchase = new Purchase();
            while ((itemDetails = reader.readLine()) != null) {
                this.purchase.addItem(
                        scanQty(itemDetails),
                        scanDetails(itemDetails),
                        scanShelfPrice(itemDetails)
                );
            }
            reader.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public Purchase getPurchase() {
        return this.purchase;
    }

    private int scanQty(String details) {
        Pattern p = Pattern.compile("^[\\d+]+");
        Matcher m = p.matcher(details);
        m.find();
        return Integer.parseInt(m.group(0));
    }

    private String scanDetails(String details) {
        Pattern p = Pattern.compile("(?!^\\d)[A-Za-z].+(?=\\sat\\s\\d+.\\d+$)");
        Matcher m = p.matcher(details);
        m.find();
        return  m.group(0);
    }

    private Double scanShelfPrice(String details) {
        Pattern p = Pattern.compile("\\d+.\\d+$");
        Matcher m = p.matcher(details);
        m.find();
        return Double.parseDouble(m.group(0));
    }
}