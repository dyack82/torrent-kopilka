package com.dyack.kopilka.entity;

import com.dyack.kopilka.entity.enums.CategoryEnum;
import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "category_id", length = 6, nullable = false)
    private long category_id;

//    @Column(name = "name")
//    @Enumerated(EnumType.STRING)
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "name")
    private CategoryEnum name;

    public Category() {
    }

    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }


    public CategoryEnum getName() {
        return name;
    }

    public void setName(CategoryEnum name) {
        this.name = name;
    }
    
    

}
