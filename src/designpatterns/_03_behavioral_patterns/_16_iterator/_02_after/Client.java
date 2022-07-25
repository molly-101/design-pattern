package designpatterns._03_behavioral_patterns._16_iterator._02_after;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost(new Post());
        board.addPost(new Post());
        board.addPost(new Post());

        board.getRecentPostIterator().forEachRemaining(System.out::println);
    }
}
