# Online Shop

In this exercise, we are going to write classes to build a simple online shop.

## Warehouse

Write a class `Warehouse` with these methods:
* `public void addProduct(String product, int price, int stock)`: add a product to the warehouse with given price and amount of stock
* `public int price(String product)`: returns the price of a given product, if the product does not exist return -99.

Work with a `Map<String, Integer>` for the prices and a `Map<String, Integer>` for the stock.

Example:

```java
Warehouse warehouse = new Warehouse();
warehouse.addProduct("milk", 3, 10);
warehouse.addProduct("coffee", 5, 7);

System.out.println("prices:");
System.out.println("milk: " + warehouse.price("milk"));
System.out.println("coffee: " + warehouse.price("coffee"));
System.out.println("sugar: " + warehouse.price("sugar"));
```

returns as output:

```console
prices:
milk: 3
coffee: 5
sugar: -99
```

## Stock

Add these methods to `Warehouse`:
* `public int stock(String product)`: returns the stock of a given product, if the product is not present return 0
* `public boolean take(String product)`: returns true and decreases the stock of the given product by 1 if the product was present, if the product is not present the method returns false
  * The stock can never be lower than 0

Example:

```java
Warehouse warehouse = new Warehouse();
warehouse.addProduct("coffee", 5, 1);

System.out.println("stock:");
System.out.println("coffee:  " + warehouse.stock("coffee"));
System.out.println("sugar: " + warehouse.stock("sugar"));

System.out.println("taking coffee " + warehouse.take("coffee"));
System.out.println("taking coffee " + warehouse.take("coffee"));
System.out.println("taking sugar " + warehouse.take("sugar"));

System.out.println("stock:");
System.out.println("coffee:  " + warehouse.stock("coffee"));
System.out.println("sugar: " + warehouse.stock("sugar"));
```

returns as output:

```console
stock:
coffee:  1
sugar: 0
taking coffee true
taking coffee false
taking sugar false
stock:
coffee:  0
sugar: 0
```

## Listing Products

Add this method to `Warehouse`:
* `public Set<String> products()`: returns all products in the warehouse as a set

Example:

```java
Warehouse warehouse = new Warehouse();
warehouse.addProduct("milk", 3, 10);
warehouse.addProduct("coffee", 5, 6);
warehouse.addProduct("buttermilk", 2, 20);
warehouse.addProduct("yogurt", 2, 20);

System.out.println("products:");

for (String product: warehouse.products()) {
    System.out.println(product);
}
```

returns as output:

```console
products:
buttermilk
yogurt
coffee
milk
```

## Item

Add the class `Item`, an item is a product with a quantity:

Methods:
* `public Item(String product, int qty, int unitPrice)`: create a new item with a quantity and a price per item
* `public int price()`: the total price of the item (quantity * unit price)
* `public void increaseQuantity()`: increase the quantity by 1
* `public String toString()`: print the item in readable form

Example:

```java
Item item = new Item("milk", 4, 2);
System.out.println("an item that contains 4 milks has the total price of " + item.price());
System.out.println(item);
item.increaseQuantity();
System.out.println(item);
```

returns as output:

```console
an item that contains 4 milks has the total price of 8
milk: 4
milk: 5
```

## Shopping Cart

Time to implement the shopping cart!

You can add products to the shopping cart. Internally, the shopping cart uses the `Item` class to keep track of the products.

Create the class `ShoppingCart` with the following methods:
* a constructor without arguments
* `public void add(String product, int price)`: add an item to the cart with the given product and price, the quantity of the item is 1
* `public int price()`: return the full price of the cart

Example:

```java
ShoppingCart cart = new ShoppingCart();
cart.add("milk", 3);
cart.add("buttermilk", 2);
cart.add("cheese", 5);
System.out.println("cart price: " + cart.price());
cart.add("computer", 899);
System.out.println("cart price: " + cart.price());
```

returns as output:

```console
cart price: 10
cart price: 909
```

## Printing the Cart

Add a method `public void print()` to the class `ShoppingCart`. The method prints all items in the `ShoppingCart`, the order is not important.

Example:

```java
ShoppingCart cart = new ShoppingCart();
cart.add("milk", 3);
cart.add("buttermilk", 2);
cart.add("cheese", 5);
cart.add("computer", 899);
```

returns as output:

```console
buttermilk: 1
cheese: 1
computer: 1
milk: 1
```

## Quantity in Cart

Adjust the `ShoppingCart` so that if a product is added twice, the quantity of the item in the cart is increased.

Example:

```java
ShoppingCart cart = new ShoppingCart();
cart.add("milk", 3);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");

cart.add("buttermilk", 2);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");

cart.add("milk", 3);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");

cart.add("milk", 3);
cart.print();
System.out.println("cart price: " + cart.price() + "\n");
```

returns as output:

```console
milk: 1
cart price: 3

buttermilk: 1
milk: 1
cart price: 5

buttermilk: 1
milk: 2
cart price: 8

buttermilk: 1
milk: 3
cart price: 11
```

## Store

Time to add a `Store` class. The shop has a department store with some products and a shopping cart for each customer passing by.

Create a class `Store` and paste the code below into it:

```java
import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // the method that handles the customers visit to the store.
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }

            // Add code here that adds the product to the shopping cart if there is stock and then lowers the stock
        }

        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
```

Now copy this code to your main method:

``` java
Warehouse warehouse = new Warehouse();
warehouse.addProduct("coffee", 5, 10);
warehouse.addProduct("milk", 3, 20);
warehouse.addProduct("cream", 2, 55);
warehouse.addProduct("bread", 7, 8);

Scanner scanner = new Scanner(System.in);

Store store = new Store(warehouse, scanner);
store.shop("John");
```

To make everything work, you just need to finish the method `public void shop(String customer)` in `Store`.

Then execute the main method!