package fr.fargeol.ariaretriever.retriever;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dog")
public class DogEntity {
    @Id
    String name;
    Integer size;
    String color;
    String breed;

    public static DogEntity create(String name, String color, String breed, int size) {
        DogEntity dogEntity = new DogEntity();

        dogEntity.name = name;
        dogEntity.color = color;
        dogEntity.breed = breed;
        dogEntity.size = size;

        return dogEntity;
    }
}
