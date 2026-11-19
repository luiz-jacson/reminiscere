package reminiscere.entities;

import java.time.Instant;

import jakarta.persistence.*;

@Entity
@Table(name = "card")
public class Card{

    @Id
    @GeneratedValue(strategy = GenerationType.Sequence, generator = "card_id_gen")
    @SequenceGenerator(name = "card_id_gen", sequenceName = "card_id_seq", allocationSize = 1)
    private Long id;

    private  Deck deck;

    @Column(name = "front", nullable = false, length = "500")
    private String front;

    @Column(name = "back", nullable = false, length = "2000")
    private String back;

    @CreationTimestamp
    @Column(name = "createdAt", nullable = false)
    private Instant createdAt;
    
    @UpdateTimestamp
    @Column(name = "updatedAt", nullable = false)
    private Instant updatedAt;

    

}