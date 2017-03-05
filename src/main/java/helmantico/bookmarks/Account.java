package helmantico.bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Account {

    @OneToMany(mappedBy = "account")
    private Set<Bookmark> bookmarks = new HashSet<>();

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public Set<Bookmark> getBookmarks() {

        return bookmarks;
    }

    @JsonIgnore
    public String password;
    public String username;

    public Account( String username, String password) {
        this.password = password;
        this.username = username;
    }

    Account(){
    }
}
