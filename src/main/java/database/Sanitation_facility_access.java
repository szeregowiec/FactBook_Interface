package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Sanitation_facility_access{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Improved improved;
    @OneToOne(cascade = {CascadeType.ALL})
    private Improved unimproved;

    public Improved getImproved() {
        return improved;
    }

    public Improved getUnimproved() {
        return unimproved;
    }
}