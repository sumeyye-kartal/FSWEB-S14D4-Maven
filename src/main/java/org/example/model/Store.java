package org.example.model;

public class Store {
    public static void main(String[] args) {

        //listProducts();
      ProductForSale[] products = new ProductForSale[5];
      products[0] = new Chocolate("sweet", 15,"chck desc");
      products[1] = new Bread("Bakery",5, "br desc","eincorn", "brown");
      products[2] = new Coke("Drinks", 15, "dr desc", true, 2.5 );

      listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
          for (ProductForSale product : products) {
              if (product != null) {
                  product.showDetails();
              }
          }
    }
}