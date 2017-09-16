package nn.convolution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 16.09.17.
 */
public class ConvLayer {
    private int height;
    private int width;
    private int neuronsNumber;
    private ConvLayer previousLayer;
    private List<ConvLayer> children;

    public ConvLayer(int height, int width, ConvLayer previousLayer) {
        this.height = height;
        this.width = width;
        this.neuronsNumber = this.height * this.width;
        this.previousLayer = previousLayer;
        this.children = new ArrayList<>();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void child(ConvLayer layer) {
        this.children.add(layer);
    }
}
