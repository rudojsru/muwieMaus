package designPatterns.dinnerBuilder;

import designPatterns.dinnerBuilder.components.Salad;
import designPatterns.dinnerBuilder.components.Soup;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
 @Builder
 @Getter
 @ToString
public class Dinner {
    private String bread;
    private List<Soup> soup;
    private List<Salad> salad;

    public Dinner(String bread, List<Soup> soup, List<Salad> salad) {
        this.bread = bread;
        this.soup = soup;
        this.salad = salad;
    } 
}
