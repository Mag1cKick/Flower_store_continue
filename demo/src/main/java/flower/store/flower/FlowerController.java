package flower.store.flower;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;
import lombok.Getter;

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
            new Flower(count, FlowerColor.RED, countl, FlowerType.ROSE)
        );
    }
}
