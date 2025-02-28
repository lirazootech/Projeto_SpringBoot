package dio.SpringBoot;

import org.springframework.stereotype.Component;

@Component

public class Calculadora {
    /**
     * @param numero1
     * @param numero2
     * @return
     */
    public int somar(int numero1, int numero2){
        return numero1+numero2;
    }
}
