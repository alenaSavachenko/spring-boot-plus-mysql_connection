package adsd.app.bouwapp.model;

import javax.persistence.*;

@Entity
@Table(name="test")

public class Test {

    //define fields, constructors, getters and setters

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name="tutorial_title")
    private String tutorial_title;

    public Test(int id, String tutorial_titile) {
        this.id = id;
        this.tutorial_title = tutorial_titile;
    }

    public Test(String tutorial_titile) {
        this.tutorial_title = tutorial_titile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTutorial_titile() {
        return tutorial_title;
    }

    public void setTutorial_titile(String tutorial_titile) {
        this.tutorial_title = tutorial_titile;
    }

    public Test() {};
}
