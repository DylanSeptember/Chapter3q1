package chapter3;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    Collection<String> collection= new LinkedHashSet<String>();
    Map<Object,String> mapPrice = new HashMap<Object, String>();
    List<Map.Entry<Double, String>> listOrder =new ArrayList<Map.Entry<Double, String>>();


    public static void main( String[] args )
    {
        App app = new App();

        Map<Double, String> map = new HashMap<Double, String>(app.getMap());

        Iterator<Map.Entry<Double, String>> iterator;

        System.out.println("MENU****************************");
        System.out.println("Meal************************Price");
        System.out.println("choose meal option or '9' to exit");



        int x;
Scanner input = new Scanner(System.in);
do {
    int i=1;
    iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {

        Map.Entry<Double, String> mapPiece = iterator.next();


        System.out.println(i++ + ") " + mapPiece.getValue() + "\t\t" + String.format("R%.2f", mapPiece.getKey().doubleValue()));

    }

    x = input.nextInt();

    i = 1;
    iterator = map.entrySet().iterator();
    while (iterator.hasNext() && i <= x) {
        Map.Entry<Double, String> mapPiece = iterator.next();

        if (i++ == x)
            app.appendList(mapPiece);

    }
}while(x!=9);
        app.displayList();



    }

    App()
    {
        popCollection();
        popMap();
    }

    public void popCollection()
    {


        collection.add("chicken");
        collection.add("beef");
        collection.add("pork");
        collection.add("dog");

    }

    public void popMap()
    {
        Iterator iter = collection.iterator();
        mapPrice.put(60.0,iter.next().toString());
        mapPrice.put(20.0,iter.next().toString());
        mapPrice.put(35.0,iter.next().toString());
        mapPrice.put(150.0,iter.next().toString());
    }

    public void appendList(Map.Entry<Double, String> order)
    {
        listOrder.add(order);
        System.out.println(order);
    }

    public Collection getCollection()
    {
        return collection;
    }

    public Map getMap()
    {
        return mapPrice;
    }

    public List getList()
    {
        return listOrder;
    }

    public void displayList()
    {

        System.out.println("Todays orders:");
        if(listOrder.size()>0){
        for(int i = 0; i<listOrder.size();i++) {
            System.out.println(listOrder.get(i).getValue());

        }
        }
        else
        {
            System.out.println("no orders has been placed today");
        }
    }

}
