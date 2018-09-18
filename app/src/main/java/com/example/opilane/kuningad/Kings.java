package com.example.opilane.kuningad;


import java.util.ArrayList;
import java.util.List;

// second part of the data resource, the class Kings makes King objects available
public class Kings
{
    private List<King> list = new ArrayList<>();

    // adding multidimensional array values into the list
    public Kings()
    {
        for (String[] arr: data)
            list.add(new King(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
    }


    public List<King> getKings()
    {
        return list;
    }
    // our multidimensional array
    private static final String[] [] data =
            {
                    {"Henry VIII", "1509", "1547"},
                    {"Edward VI", "1547", "1553"},
                    {"Mary I", "1553", "1558"},
                    {"Elizabeth I", "1558", "1603"},
                    {"Charles I", "1660", "1685"},
                    {"James II", "1685", "1688"},
                    {"Tarmo VIII", "1509", "1547"},
                    {"Karl VI", "1524", "1600"},
                    {"Mairo I", "1900", "1960"},
                    {"Priit I", "1515", "1615"},
                    {"Kreeger I", "1660", "1685"}
            };

}
