
import java.util.Random;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

public class Issue9 {

    public static void main(String[] args) {
        double phase = 0;
        double[][] xyAxis = generateChart(phase);
        final org.knowm.xchart.XYChart genChart = QuickChart.getChart("STIW3054  Display Random Numbers", "Counter", "Number", "add", xyAxis[0], xyAxis[1]);
        //generate chart
        genChart.getStyler().setLegendVisible(false);
        genChart.getStyler().setYAxisMax(100.0);
        genChart.getStyler().setXAxisMin(0.0);

        //display the chart
        final SwingWrapper<XYChart> sWrapper = new SwingWrapper<XYChart>(genChart);
        sWrapper.displayChart();

        genChart.updateXYSeries("add", xyAxis[0], xyAxis[1], null);
        sWrapper.repaintChart();

    }

    public static double[][] generateChart(double phase) {

        double result;
        double ranNo;
        double[] xAxis = new double[100];
        double[] yAxis = new double[100];

        for (int i = 0; i < xAxis.length; i++) {
            result = phase + (6.3 / xAxis.length * i);
            ranNo = rn(0, 100);
            xAxis[i]= result;
            yAxis[i] = ranNo;

        }
       return new double [][]{xAxis,yAxis} ;

    }

    public static double rn(int min, int max) {
        Random r = new Random();
        int Low = 0;
        int High = 100;
        double result = r.nextInt(High - Low) + Low;
        return result;
    }

}
