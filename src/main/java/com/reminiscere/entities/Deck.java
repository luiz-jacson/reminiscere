package packageName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "deck")
class entityClassName {

    @Id
    @GeneratedValue(strategy = GenerationType.Sequence, generator = "deck_id_gen")
    @SequenceGenerator(name = "deck_id_gen", sequenceName = "deck_id_seq", allocationSize = 1)
    private id;



}