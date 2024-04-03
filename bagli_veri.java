package dinamik_veri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class bagli_veri {

    ArrayList<Integer> x = new ArrayList<>();
    ArrayList<Integer> y = new ArrayList<>();
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    int i = 0;
    public String path;

    public bagli_veri(String path) {
        this.path = path;
    }

    public void indis() {
        for (i = 0; i < x.size(); i++) {
            y.add(i);
            b.add(i);
        }

    }

    public void write() {
        i = 0;
        for (Integer number : x) {
            System.out.println(a.get(i) + "\t" + b.get(i)+"\t\t\t"+x.get(i)+"\t"+y.get(i));
            if (x.size() > i) {
                i++;
            }

        }
    }

    public void read() {
        String s = " ";
        try {
            FileReader file = new FileReader(this.path);
            BufferedReader buf = new BufferedReader(file);
            while ((s = buf.readLine()) != null) {
                int number = Integer.parseInt(s);
                x.add(number);
                a.add(number);

            }
            file.close();
        } catch (IOException ex) {
        }
        System.out.println("------SIRALANMAMIŞ HALİ-----\t-----SIRALANMIŞ HALİ---------");
        System.out.println("VERİ\tADRES\t\t\tVERİ\tADRES");
        indis();
        sirala(x, y);
        write();
    }

    public void sirala(ArrayList<Integer> x, ArrayList<Integer> y) {
        int n = x.size();
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int gecici_x = x.get(i);
                int gecici_y = y.get(i);
                int j = i;
                while (j >= gap && x.get(j - gap) > gecici_x) {
                    x.set(j, x.get(j - gap));
                    y.set(j, y.get(j - gap));
                    j -= gap;
                }
                x.set(j, gecici_x);
                y.set(j, gecici_y);
            }
            if (gap == 2) {
                gap = 1;
            } else {
                gap = (int) (gap / 2.2);
            }
        }
    }
}
