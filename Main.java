class Main {
  public static void main(String[] args) {
        String[] defaultShoppingBaskets = {
                "ShoppingBaskets/itemsbeforetax1.txt",
                "ShoppingBaskets/itemsbeforetax2.txt",
                "ShoppingBaskets/itemsbeforetax3.txt"
        };

        String[] queuedShoppingBasketFiles = (defaultShoppingBaskets.length > 0) ?defaultShoppingBaskets : defaultShoppingBaskets;

        for (String shoppingbasket : queuedShoppingBasketFiles) {
        //  System.out.println("inside for loop");  **debugging
                ReceiptInputItems rScanner = new ReceiptInputItems(shoppingbasket);
                Purchase purchase = rScanner.getPurchase();
                TaxTotalCalc calculate = new TaxTotalCalc(purchase.getPurchased());
                ReceiptOutput display = new ReceiptOutput();
                for(Item item: purchase.getPurchased()){
                    display.purchaseList(item);
                }
                display.salesTax(calculate.getTaxTotal());
                display.totalSale(calculate.getSaleTotal());
      }
  }

}

