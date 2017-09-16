package nn.convolution;

/**
 * Created by dmitry on 16.09.17.
 */
public class ConvDivider {
    private int heightDivider;
    private int widthDivider;

    public ConvDivider(int heightDivider, int widthDivider) {
        this.heightDivider = heightDivider;
        this.widthDivider = widthDivider;
    }

    public int getHeightDivider() {
        return heightDivider;
    }

    public int getWidthDivider() {
        return widthDivider;
    }
}
