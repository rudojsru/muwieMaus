package designPatterns.dinnerBuilder;

 
   import designPatterns.dinnerBuilder.components.Soup;

   import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Dinner asdf = Dinner.builder()
                .bread("asdf")
                .soup(Arrays.asList(Soup.VEGETABLES,Soup.WOTHER))
           //     .salad(Arrays.asList(Salad.OIL1, Salad.VEGETABLES))
                .build();

        System.out.println(asdf);
    }
}
