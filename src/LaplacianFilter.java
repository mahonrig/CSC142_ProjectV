/**
 * Created by Aaron Hand on 6/1/16.
 * Project: CSC142_ProjectV
 */
public class LaplacianFilter implements Filter{
    public void filter(PixelImage theImage) {
        Pixel[][] data = theImage.getData();

        theImage.setData(theImage.getWeightedImage(8));

    }
}
