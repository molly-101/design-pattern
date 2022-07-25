package designpatterns._03_behavioral_patterns._16_iterator._02_after;

import java.util.Iterator;

public class RecentPostIterator implements Iterator<Post> {

    private Iterator<Post> internalIterator;

    public RecentPostIterator(Board board) {
        this.internalIterator = board.getPosts().iterator();
    }

    @Override
    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return this.internalIterator.next();
    }
}
