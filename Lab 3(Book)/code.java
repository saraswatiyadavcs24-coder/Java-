import java.util.Scanner;

class Books
{
    String name;
    String author;
    int price;
    int num_pages;

    Books(String name, String author, int price, int num_pages)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    public String toString()
    {
        return "Book name : " + name + "\n"
             + "Author name : " + author + "\n"
             + "Price : " + price + "\n"
             + "Number of pages : " + num_pages + "\n";
    }
}

public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of books : ");
        int n = in.nextInt();
        in.nextLine();   // 🔑 buffer clear

        Books[] b = new Books[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("\nEnter details for book " + (i + 1));

            System.out.print("Name : ");
            String name = in.nextLine();

            System.out.print("Author : ");
            String author = in.nextLine();

            System.out.print("Price : ");
            int price = in.nextInt();

            System.out.print("Number of pages : ");
            int num_pages = in.nextInt();
            in.nextLine(); // 🔑 buffer clear

            b[i] = new Books(name, author, price, num_pages);
        }

        System.out.println("\nBook details:\n");

        for(int i = 0; i < n; i++)
        {
            System.out.println(b[i]);
        }

        in.close();
    }
}
