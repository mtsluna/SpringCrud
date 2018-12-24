package ml.work.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ml.work.main.entities.Province;

public interface ProvinceRepository extends JpaRepository<Province, Integer>{}
