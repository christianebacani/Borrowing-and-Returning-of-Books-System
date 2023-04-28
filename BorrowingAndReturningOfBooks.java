import java.util.Scanner;
public class BorrowingAndReturningOfBooks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price = 50;
        int total = 0;
        boolean transaction = true;
        
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        System.out.print("1.) Borrow a book\n");
        System.out.print("2.) Return a book\n");
        System.out.print("3.) About\n");
        System.out.print("4.) Exit\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                while(transaction){
                    
                
                System.out.print("\n\tAVAIALABLE BOOKS\n\n");
                System.out.print("1.) The Lord of the Rings\n\n");
                System.out.print("2.) Nineteen Eighty Four\n\n");
                System.out.print("3.) The Hobbit\n\n");
                System.out.print("4.) To Kill a Mockingbird\n\n");
                System.out.print("5.) The Catcher in the Rye\n\n");
                System.out.print("6.) One Hundred Years of Solitude\n\n");
                System.out.print("7.) The Great Gatsby\n\n");
                System.out.print("8.) Jane Eyre\n\n");
                System.out.print("9.) Catch-22\n\n");
                
                System.out.print("Enter your choice here : ");
                int userChoice = input.nextInt();
                
                System.out.print("Enter the quantity here : ");
                int quantity = input.nextInt();
                
                System.out.print("Enter how many days you wanted it to borrow? : ");
                int days = input.nextInt();
                
                total += (quantity * price);
                
                System.out.print("Do you want to borrow more books? (y/n): ");
                input.nextLine();
                String borrowMore = input.nextLine();
                
                if(borrowMore.equalsIgnoreCase("n")){
                    
                    transaction = false;
                    System.out.print("The total price is: P " + total + "\n");
                    System.out.print("Enter your payment here : P ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    System.out.print("Change : P " + change + "\n");
                    System.out.print("\n\nTHANK YOU,PLEASE COME AGAIN!");
                    
                }
                
                }
                break;
                
            case 2:
                System.out.print("\n\tRETURNING OF A BOOK\n\n");
                System.out.print("1.) The Lord of the Rings\n\n");
                System.out.print("2.) Nineteen Eighty Four\n\n");
                System.out.print("3.) The Hobbit\n\n");
                System.out.print("4.) To Kill a Mockingbird\n\n");
                System.out.print("5.) The Catcher in the Rye\n\n");
                System.out.print("6.) One Hundred Years of Solitude\n\n");
                System.out.print("7.) The Great Gatsby\n\n");
                System.out.print("8.) Jane Eyre\n\n");
                System.out.print("9.) Catch-22\n\n");
                
                System.out.print("Enter the book you want to return : ");
                int userChoice = input.nextInt();
                
                System.out.print("\n\n---SUCCESSFULLY RETURNED---");
                break;
                
            case 3:
                System.out.print("\nWelcome to our Borrowing and Returning Book Code System!\nIn our library, we are dedicated to providing you with a seamless and efficient\nborrowing and returning experience. Our online code system is designed to streamline the\nprocess and make it convenient for you to manage your book loans.\n");
                break;
                
            case 4:
                System.out.print("\n\n---EXITING---");
                break;
                
            default:
                System.out.print("\n\nINVALID CHOICE!");
            
        }
        
    }
}
