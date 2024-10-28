package flower.store.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flowers")
public class FlowerController {
    final public int count = 12; 
    final public int countl = 120;
    
    @GetMapping(produces = "application/json")
    public List<Flower> getFlowers() {
        return List.of(
            Flower.rose(),
            new Flower(count, FlowerColor.YELLOW, countl, FlowerType.ROSE)
        );
    }
}
