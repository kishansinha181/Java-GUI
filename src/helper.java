import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Result {
    public static void main(String[] args) {

    }
}
class finalresult extends JFrame{

    public finalresult(ArrayList<ArrayList<String>> arr){
//        JLabel yo = new JLabel(ans);
//        add(yo);
        HashMap<String,Integer > active = new HashMap<>();
        HashMap<String,Integer > recovered = new HashMap<>();
        active.put("A",0);
        active.put("B",0);
        active.put("C",0);
        active.put("D",0);

        recovered.put("A",0);recovered.put("B",0);recovered.put("C",0);recovered.put("D",0);



        JLabel la = new JLabel("List of Patients: ");
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

// Create a couple of columns
        model.addColumn("NAME");
        model.addColumn("AGE");
        model.addColumn("TOWER");
        model.addColumn("A. Since");
        model.addColumn("R. Date");
        model.addColumn("STATUS");
        add(la);
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLUE);

        add(new JScrollPane(table));


        for(int i =0 ; i < arr.size(); i++){
//
            model.addRow(new Object[]{arr.get(i).get(0), arr.get(i).get(1),arr.get(i).get(2),arr.get(i).get(3),arr.get(i).get(4),arr.get(i).get(5)});
            if(arr.get(i).get(5) == "Active"){
                table.addRowSelectionInterval(i,i);
                active.put(arr.get(i).get(2),active.get(arr.get(i).get(2))+1);
            }
            if(arr.get(i).get(5) == "Recovered"){
                recovered.put(arr.get(i).get(2),recovered.get(arr.get(i).get(2))+1);
            }
        }

        String finalAns = " Number of Active : Recovered Cases in Towers are :: " ;
        for(String x : active.keySet()){
            if(active.get(x)>0 || recovered.get(x)>0){
                finalAns+=  x + " -> " + active.get(x) + " : " + recovered.get(x) + "   ";
            }
        }
        JLabel lfinal = new JLabel(finalAns);

        add(lfinal);


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
