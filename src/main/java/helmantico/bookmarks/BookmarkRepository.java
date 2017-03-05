package helmantico.bookmarks;


import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
import java.util.Collection;

public interface BookmarkRepository extends JpaRepository<Bookmark,Long>{

    Collection<Bookmark> findByAccountUsername(String username);
}
