
package kata3_ade;

public class Kata3_ADE {

    public static void main(String[] args) {
        Histogram histogram = new Histogram<String>();
        histogram.increment("gmail.com");
        histogram.increment("ull.es");
        histogram.increment("ulpgc.com");
        histogram.increment("gmail.com");
        histogram.increment("outlook.com");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
