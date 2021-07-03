package pl.pjwstk.jaz19545nbp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface NBPRepository extends JpaRepository<NBP, Long> {

    @Override
    <S extends NBP> S save(S s);
}
