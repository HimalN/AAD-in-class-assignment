package aop;

import org.springframework.stereotype.Component;

@Component("food")
public class FoodLover {

    public void initialFav() {
        System.out.println("Mahesh first preferred food items : ");
    }

    public void changedFav() {
        System.out.println("Mahesh second preferred food items : ");
    }
}
