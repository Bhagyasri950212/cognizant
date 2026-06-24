public class SearchDemo {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101,
                        "Keyboard",
                        "Electronics"),

                new Product(102,
                        "Laptop",
                        "Electronics"),

                new Product(103,
                        "Mobile",
                        "Electronics"),

                new Product(104,
                        "Monitor",
                        "Electronics"),

                new Product(105,
                        "Mouse",
                        "Electronics")
        };

        Product p1 =
                LinearSearch.search(
                        products,
                        "Monitor");

        System.out.println(
                "Linear Search Result:");

        System.out.println(p1);

        Product p2 =
                BinarySearch.search(
                        products,
                        "Monitor");

        System.out.println(
                "Binary Search Result:");

        System.out.println(p2);
    }
}
