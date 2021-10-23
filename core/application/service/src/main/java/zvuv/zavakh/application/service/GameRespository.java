package zvuv.zavakh.application.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRespository extends JpaRepository<Game, Long> {
}
