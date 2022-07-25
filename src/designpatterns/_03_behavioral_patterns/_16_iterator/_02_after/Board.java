package designpatterns._03_behavioral_patterns._16_iterator._02_after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    private List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this);
    }
}
