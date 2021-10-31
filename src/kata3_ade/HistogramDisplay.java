
package kata3_ade;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame {

    private final Histogram <String> histogram;
    
    public HistogramDisplay(Histogram<String> histrogram) {
        super("HISTOGRAM");
        this.histogram=histrogram;
        this.setContentPane(createPanel());
        this.pack();
    }

    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }

    
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Titulo", 
                                                       "Email domains", 
                                                       "Emails Received", 
                                                       dataSet, 
                                                       PlotOrientation.VERTICAL, 
                                                       false, 
                                                       false, 
                                                       rootPaneCheckingEnabled);
        return chart;
    }
    
    
    public void execute(){
        setVisible(true);
    }

    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String key : histogram.keySet()){
            dataset.addValue(histogram.get(key), "", key);
        }
        return dataset;
    }
}
