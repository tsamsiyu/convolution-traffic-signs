package nn.convolution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 16.09.17.
 */
public class ConvNNBuilder {
    private List<ConvDivider> dividers = new ArrayList<>();
    private int height;
    private int width;

    public ConvNNBuilder(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public ConvNNBuilder divide(int heightDivider, int widthDivider) {
        ConvDivider divider = new ConvDivider(heightDivider, widthDivider);
        this.dividers.add(divider);
        return this;
    }

    public ConvNNBuilder height(int height) {
        this.height = height;
        return this;
    }

    public ConvNNBuilder width(int width) {
        this.width = width;
        return this;
    }

    public ConvNN build() {
        return new ConvNN(this.height, this.width, this.dividers);
    }
}
