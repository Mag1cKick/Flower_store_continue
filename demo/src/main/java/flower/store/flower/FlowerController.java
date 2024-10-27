package flower.store.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flowers")
public class FlowerController {
    
    @GetMapping(produces = "application/json")
    public List<Flower> getFlowers() {
        return List.of(
            Flower.rose(),
            new Flower(12, FlowerColor.YELLOW, 120, FlowerType.ROSE) // Example of another flower
        );
    }
}
