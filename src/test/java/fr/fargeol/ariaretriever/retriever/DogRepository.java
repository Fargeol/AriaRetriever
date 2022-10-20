package fr.fargeol.ariaretriever.retriever;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<DogEntity, String> {
}
