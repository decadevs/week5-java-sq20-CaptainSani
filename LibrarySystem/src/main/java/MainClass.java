import enums.Books;
import model.Library;
import model.User;
import service.LibraryService;
import service.impl.LibraryServiceImpl;

public class MainClass {
    public static void main(String[] args) {
        User u1 = new User("sani dogo",false,true,false);
        User u2 = new User("isi nnwobi",true,false,false);
        User u3 = new User("master shifu",false,false,true);
        User u4 = new User("emmanuel",true,false,false);
        User u5 = new User("samuel",false,false,true);



        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        Library library1 = new Library(Books.PYTHON);
        Library library2 = new Library(Books.JAVA);

        libraryService.addUserToQueue(u1);
        libraryService.addUserToQueue(u2);
        libraryService.addUserToQueue(u3);
        libraryService.addUserToQueue(u4);
        libraryService.addUserToQueue(u5);


        System.out.println(libraryService.giveBook(library1));
        System.out.println(libraryService.giveBook(library1));
        System.out.println(libraryService.giveBook(library1));
        System.out.println(libraryService.giveBook(library1));
        System.out.println(libraryService.giveBook(library1));
        System.out.println(libraryService.giveBook(library1));
        System.out.println(libraryService.giveBook(library1));
        System.out.println(libraryService.giveBook(library2));
//        System.out.println(libraryService.giveBook(library3));
//        System.out.println(libraryService.giveBook(library4));
//        System.out.println(libraryService.giveBook(library5));
//        System.out.println(libraryService.giveBook(library2));
//        System.out.println(libraryService.giveBook(library4));
    }
}
