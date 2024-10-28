package flower.store.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.Getter;

import java.util.List;

@RestController
@RequestMapping("/flowers")
@Getter
public class FlowerController {
    private final int count = 12; 
    private final int countl = 120;
    
    @GetMapping(produces = "application/json")
    public List<Flower> getFlowers() {
        return List.of(
            Flower.rose(),
            new Flower(count, FlowerColor.YELLOW, countl, FlowerType.ROSE)
        );
    }
}
