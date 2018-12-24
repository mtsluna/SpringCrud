package ml.work.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ml.work.main.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{}
