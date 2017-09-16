import nn.convolution.ConvNN;
import nn.convolution.ConvNNBuilder;

/**
 * Created by dmitry on 16.09.17.
 */
public class Main {

    public static void main(String[] args) {
        ConvNN nn = (new ConvNNBuilder(720, 480))
                .divide(2, 2)
                .divide(5, 5)
                .divide(4, 4)
                .divide(3, 3)
                .build();
    }

}
