package lv.venta.demo.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Professor {
        
        @Setter(value=AccessLevel.NONE)
        @Column(name="IdProf")
    	@Id
    	@GeneratedValue(strategy=GenerationType.AUTO)
        private int idProf;
        
        @Column(name="Name")
        private String name;
        
        @Column(name="Surname")
        private String surname;
        
        @Column(name="Title")
        private String title;
        /*
        //mappedByBy - viemēr jānorda uz 
        //mianīgā nosaukumu pretējā pusē
        @OneToOne(mappedBy="professor")
        @ToString.Exclude
        private Subject subject;
        */
        @ManyToMany
        @JoinTable(joinColumns=@JoinColumn(name="IdProf"),
        inverseJoinColumns=@JoinColumn(name="IdSubj"))
        private Collection<Subject> subjects = new ArrayList<Subject>();
        
        
        public Professor(String name, String surname, String title) {
                this.name =         name;
                this.surname =         surname; 
                this.title =         title;
        }
        
        
        public void addSubject(Subject subject)
        {
        	subjects.add(subject);
        }
        
        
}
