package zvuv.zavakh.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRespository gameRespository;

    @Autowired
    public GameService(GameRespository gameRespository) {
        this.gameRespository = gameRespository;
    }

    public void save(GameDto gameDto) {
        Game game = new Game();

        game.setName(gameDto.getName());

        gameRespository.save(game);
    }

    public List<Game> findAll() {
        return gameRespository.findAll();
    }
}
