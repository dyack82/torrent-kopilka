package com.dyack.kopilka.entity;

//import java.util.Date;
import java.io.Serializable;
import java.util.Date;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment implements Serializable, Comparable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film filmComment;

    @Column(name = "text_comment")
    private String textComment;

    @Column(name = "username")
    private String username;

    @Column(name = "add_date")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date addDate;
    
    public Comment() {
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public Film getFilmComment() {
//        return filmComment;
//    }

    public void setFilmComment(Film filmComment) {
        this.filmComment = filmComment;
    }

    @Override
    public String toString() {
        return '{' + "text=" + textComment + ", username=" + username + ", addDate=" + addDate.getHours() + '}';
    }


    @Override
    public int compareTo(Object o) {
        return -1;
    }

}
