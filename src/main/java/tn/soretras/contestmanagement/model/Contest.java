package tn.soretras.contestmanagement.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contests")
public class Contest {
@Column
@Id
  private int id ;
  @Column
  private int idcontestannounce ;
  @Column
  private String name ;
  @Column
  private String parent ;
  @Column
  private String desciption ;

    public Contest(int id, String name, String parent, String desciption) {
        this.id = id;
        this.name = name;
        this.parent = parent;
        this.desciption = desciption;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return this.parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getDesciption() {
        return this.desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

}
