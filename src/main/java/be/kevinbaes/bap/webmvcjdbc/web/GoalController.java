package be.kevinbaes.bap.webmvcjdbc.web;

import be.kevinbaes.bap.webmvcjdbc.persistence.Goal;
import be.kevinbaes.bap.webmvcjdbc.persistence.GoalRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goal")
public class  GoalController {

  private final GoalRepository goalRepository;

  public GoalController(GoalRepository goalRepository) {
    this.goalRepository = goalRepository;
  }

  @GetMapping
  public Iterable<Goal> findAll(@RequestParam(value = "limit", required = false) Integer limit) {
    if(limit == null) {
      return goalRepository.findAll();
    }

    return goalRepository.findAllWithLimit(limit);
  }

  @PostMapping
  public Goal create(@RequestBody Goal goal) {
    return goalRepository.save(goal);
  }

}
