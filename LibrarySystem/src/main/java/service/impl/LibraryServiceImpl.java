package service.impl;

import enums.Books;
import model.Library;
import model.User;
import model.UserComparator;
import service.LibraryService;

import java.util.PriorityQueue;

public class LibraryServiceImpl implements LibraryService {

    PriorityQueue<User> UserOnQueue;

    public LibraryServiceImpl(){
        UserOnQueue = new PriorityQueue<>(new UserComparator());
    }

    @Override
    public void addUserToQueue(User user){
        UserOnQueue.add(user);
    }

    @Override
    public String giveBook(Library library) {
        if (UserOnQueue.isEmpty()) {
            return "No user is on the queue";
        }
        User user = UserOnQueue.poll();
        return user.getName() + " has taken " + Books.PYTHON + " Book";
    }

//    @Override
//    public String returnBook(Library library) {
//        if(UserOnQueue.isEmpty()){
//            return "No user is on the queue";
//        }
//        User user = UserOnQueue.poll();
//        return user.getName()+" has taken "+ Books.PYTHON + " Book already";
//    }
}
