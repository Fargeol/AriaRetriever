package fr.fargeol.ariaretriever.retriever;

import fr.fargeol.ariaretriever.AriaRetriever;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SelectionTest {

    @Autowired
    private AriaRetriever ariaRetriever;

    @Autowired
    private DogRepository dogRepository;

    @Test
    @Transactional
    void selectEntity() {
        // GIVEN
        DogEntity hubble = DogEntity.create("Hubble", "beige", "Jack Russel", 55);
        hubble = dogRepository.save(hubble);

        // WHEN
        List<DogEntity> dogEntities = ariaRetriever
                .listEntities(DogEntity.class);

        // THEN
        assertEquals(List.of(hubble), dogEntities);
    }
}
