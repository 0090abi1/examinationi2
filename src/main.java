import models.ordering;


public class main {
    public static void main(String[] args) {

        String[] m1 ={"XL","L","M"};

        tshirt t1 = new tshirt("Gorkhali Batman","123as",1200,"puma","welcome to my shop",new String[]{"XL","L","M"});
        tshirt t2 = new tshirt("Superman","123aw",1300,"nike","welcome to my shop",new String[]{"XL","L","M"});
        tshirt t3 = new tshirt("Caption america","123ap",1400,"LV","welcome to my shop",new String[]{"XL","L","M"});

        ordering o1=new ordering("Abi",1234,new int[]{2,3,4},new int[]{1200,1300,1000});
        ordering o2=new ordering("Ram",1243,new int[]{10,30,4},new int[]{1200,1300,1800});
        ordering o3=new ordering("Sukrit",1234,new int[]{12,34,45},new int[]{1200,1300,1400});

        t1.displayInformation();
        o1.displayTotal();
        t2.displayInformation();
        o2.displayTotal();
        t3.displayInformation();
        o3.displayTotal();



    }

}