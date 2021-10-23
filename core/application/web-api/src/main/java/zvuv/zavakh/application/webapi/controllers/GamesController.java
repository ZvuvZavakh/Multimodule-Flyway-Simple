package zvuv.zavakh.application.webapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import zvuv.zavakh.application.service.Game;
import zvuv.zavakh.application.service.GameDto;
import zvuv.zavakh.application.service.GameService;

import java.util.List;

@RestController
public class GamesController {

    private final GameService gameService;

    @Autowired
    public GamesController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/games")
    public void create(@RequestBody GameDto gameDto) {
        gameService.save(gameDto);
    }

    @GetMapping("/games")
    public ResponseEntity<List<Game>> getGames() {
        List<Game> games = gameService.findAll();

        return ResponseEntity.ok(games);
    }
}
