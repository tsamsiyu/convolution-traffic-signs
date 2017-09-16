package nn.convolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dmitry on 16.09.17.
 */
public class ConvNN {
    private int height;
    private int width;
    private List<ConvDivider> dividers;
    private ConvLayer rootLayer;

    public ConvNN(int height, int width, List<ConvDivider> dividers) {
        this.height = height;
        this.width = width;
        this.dividers = dividers;
        this.rootLayer = new ConvLayer(this.height, this.width, null);
        this.createLayers(this.rootLayer, 0);
    }

    private void createLayers(ConvLayer prevLayer, int level) {
        ConvDivider divider = this.dividers.get(level);
        int height = prevLayer.getHeight() / divider.getHeightDivider();
        int width = prevLayer.getWidth() / divider.getWidthDivider();
        int layersNumber = divider.getHeightDivider() * divider.getWidthDivider();

        for (int i = 0; i < layersNumber; i++) {
            ConvLayer layer = new ConvLayer(height, width, prevLayer);
            prevLayer.child(layer);
            if ((level + 1) < this.dividers.size()) {
                this.createLayers(layer, level + 1);
            }
        }
    }
}
