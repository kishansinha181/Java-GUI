import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

class Patient{
    String name;
    int age;
    String tower;
    Date doa;
    Date dor;
    String doas;
    String dors;

    Patient(String name, int age, String tower, String doa,String dor) throws ParseException {
        this.name = name;
        this.age = age;
        this.tower = tower;
        SimpleDateFormat formatter2=new SimpleDateFormat("dd-MM-yyyy");
//        SimpleDateFormat formatter3=new SimpleDateFormat("dd-MMM-yyyy");
        this.doas = doa;
        this.dors = dor;
        this.doa = formatter2.parse(doa);
        this.dor = formatter2.parse(dor);

    }

}

public class Ap {
    public static void main(String []args) throws ParseException {

        new covid();

    }

}

class covid extends JFrame implements ActionListener {
    public String ans;
    public JTextField t1,t2;
    public JButton b;
   public JCheckBox ta,tb,tc,td;
    public JLabel l1,l2,l3;

    public covid() throws ParseException {


        setLayout(new FlowLayout());
        JLabel Heading = new JLabel("Covid Tracker");
        add(Heading);
        EmptyBorder border1 = new EmptyBorder(5, 180, 5, 200);
        EmptyBorder border2 = new EmptyBorder(5, 10, 5, 150);
        EmptyBorder border3 = new EmptyBorder(10,50,20,20);
        EmptyBorder border4 = new EmptyBorder(5, 0, 5, 100);
        EmptyBorder border5 = new EmptyBorder(10,180,20,20);
//        spacer = new JLabel("                                                                                                                        ");

         l1 = new JLabel("Input Date");
        t1 = new JTextField(10);

    l2 = new JLabel("Choose Tower(s)");
    ta = new JCheckBox("A");
        tb = new JCheckBox("B");
        tc = new JCheckBox("C");
        td = new JCheckBox("D");

         b = new JButton("Track");
//         l = new JLabel("Reslut");
        Heading.setBorder(border1);
        add(Heading);

        add(l1);

        add(t1);
        t1.setBorder(border2);
//        add(t2);
//        add(spacer);
        add(l2);
        add(ta);
        add(tb);
        add(tc);
        add(td);
        l3 = new JLabel("");
        add(l3);
        td.setBorder(border4);
        add(b);


        l3.setFont(l3.getFont().deriveFont((float)7));
        Heading.setFont(Heading.getFont().deriveFont((float) 15));
        b.addActionListener(this);

        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        int num1 = Integer.parseInt(t1.getText());
////        int num2 = Integer.parseInt(t2.getText());
////        int result = num1 + num2;
////        l.setText("Result = "+result);
        SimpleDateFormat formatter2=new SimpleDateFormat("dd-MM-yyyy");
        Date in = null;
        try {
            in = formatter2.parse("01-01-2000");
        } catch (ParseException parseException) {
            parseException.printStackTrace();

        }
        try {
            in = formatter2.parse(t1.getText());
            l1.setText("Input Date");
        } catch (ParseException parseException) {
            parseException.printStackTrace();
            l1.setText("Enter a valid date ");
        }
        ArrayList<Patient> list = new ArrayList<Patient>();
        try {
            list.add(new Patient("Flora",6, "A","01-04-2020","23-04-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Denys",24, "B","01-04-2020","23-04-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Jim",42, "C","18-05-2020","09-06-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Hazel",87, "D","23-06-2020","15-07-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Caery",72, "A","01-06-2020","23-06-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("David",7, "B","14-06-2020","06-07-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Kevim",37, "D","05-06-2020","27-06-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Tom",67, "D","20-06-2020","12-07-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Bob",74, "A","04-07-2020","26-07-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Rachel",48, "C","24-07-2020","15-08-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Thomas",21, "C","11-06-2020","03-07-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Mary",17, "D","21-06-2020","13-07-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Smith",89, "A","07-08-2020","29-08-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Pearson",47, "B","04-06-2020","26-06-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Anderson",62, "B","27-07-2020","18-08-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Johnson",10, "D","01-08-2020","23-08-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Robertz",50, "A","09-08-2020","31-08-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Julie",86, "B","02-05-2020","27-05-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("Edith",42, "D","07-06-2020","29-06-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        try {
            list.add(new Patient("John",95, "D","01-06-2020","23-06-2020"));
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }

//        SimpleDateFormat formatter2=new SimpleDateFormat("dd-MM-yyyy");


        try {
            Date inputDate = formatter2.parse(t1.getText());
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
//    inputDate.compareTo(list.get(0).doa);

        ArrayList<String> selectedTowers = new ArrayList<String>();
        if(ta.isSelected())
            selectedTowers.add("A");
        if(tb.isSelected())
            selectedTowers.add("B");
        if(tc.isSelected())
            selectedTowers.add("C");
        if(td.isSelected())
            selectedTowers.add("D");

        if(selectedTowers.size()==0 ){
            l3.setText("(Please Choose a Tower)");
        }

        else{




        ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
        for(int i = 0; i < list.size();i++){
//            long diffInMillies = Math.abs(in.getTime() - list.get(i).doa.getTime());
//            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            for(int j =0 ; j < selectedTowers.size();j++){
                if (list.get(i).tower == selectedTowers.get(j)) {



            if(in.compareTo(list.get(i).doa)>=0 && in.compareTo(list.get(i).dor)<0){

                String status = "Active";


                arr.add(new ArrayList<String>());
                arr.get(arr.size() -1).add(list.get(i).name);
                arr.get(arr.size() -1).add(list.get(i).age+"");
                arr.get(arr.size() -1).add(list.get(i).tower);
                arr.get(arr.size() -1).add(list.get(i).doas);
                arr.get(arr.size() -1).add(list.get(i).dors);
                arr.get(arr.size() -1).add(status);

//                active.replace(arr.get(arr.size() -1).get(i),active.get(arr.get(arr.size() -1).get(i))+1) ;

            }
            if(in.compareTo(list.get(i).dor)>=0) {
                String status = "Recovered";
                arr.add(new ArrayList<String>());
                arr.get(arr.size() - 1).add(list.get(i).name);
                arr.get(arr.size() - 1).add(list.get(i).age + "");
                arr.get(arr.size() - 1).add(list.get(i).tower);
                arr.get(arr.size() - 1).add(list.get(i).doas);
                arr.get(arr.size() - 1).add(list.get(i).dors);
                arr.get(arr.size() - 1).add(status);

//                recovered.replace(arr.get(arr.size() -1).get(i),recovered.get(arr.get(arr.size() -1).get(i))+1) ;
            }
            }}
        }
        Date start = null;

            try {
                start = formatter2.parse("01-04-2020");
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }

                if(l1.getText()!="Enter a valid date ")
                 new finalresult(arr);

    }}
}



