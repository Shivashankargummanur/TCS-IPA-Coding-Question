import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Laptop {
    private int laptopid;
    private String brand;
    private String ostype;
    private double price;
    private int rating;


    public int getLaptopid() {
        return laptopid;
    }

    public String getBrand() {
        return brand;
    }

    public String getOstype() {
        return ostype;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public void setLaptopid(int laptopid) {
        this.laptopid = laptopid;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOstype(String ostype) {
        this.ostype = ostype;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Laptop(int laptopid,String brand,String ostype,double price,int rating)
    {
        this.laptopid = laptopid;
        this.brand = brand;
        this.ostype = ostype;
        this.price = price;
        this.rating = rating;
    }
    
}

class Question_02 {
    

    public static int countOfLaptopsByBrand(Laptop[] laptops,String inputbrand)
    {
        int count = 0;
        for (Laptop laptop : laptops) {
            if (laptop.getBrand().equalsIgnoreCase(inputbrand)) {
                count++;
            }
        }

        return count;
    }
    public static Laptop[] searchLaptopByOsType(Laptop[] laptops, String inputostype)
    {
        int count = 0;
        // int min=Integer.MAX_VALUE;
        for (Laptop laptop : laptops) {
            if (laptop.getOstype().equalsIgnoreCase(inputostype)) {

                count++;
            }
        }
        if(count==0)
        {
            return null;
        }
        else {
            Laptop[] arr = new Laptop[count];
            int i = 0;
            for (Laptop laptop : laptops) {
                if (laptop.getOstype().equalsIgnoreCase(inputostype)) {
                    arr[i] = laptop;
                    i++;
                }

            }
            // sorting an array objects in decending order to follows this 
            Arrays.sort(arr, Comparator.comparing(Laptop::getLaptopid).reversed());

            return arr;
        }
       
       

        // System.out.println(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop[] laptops = new Laptop[4];
        int no_count;
        for(int i=0;i<laptops.length;i++)
        {
            System.out.print("Enter The Laptop Id :");
            int laptopid = sc.nextInt();
            String demo = sc.nextLine();
            System.out.print("Enter The Laptop Brand: ");
            String brand = sc.nextLine();
            System.out.print("Enter The Laptop OsType: ");
            String ostype = sc.nextLine();
            System.out.print("Enter The Laptop Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter The Laptop Rating: ");
            int rating = sc.nextInt();
            laptops[i] = new Laptop(laptopid, brand, ostype, price, rating);
        }
        String demo1 = sc.nextLine();
        System.out.print("Enter The Laptop Brand Name: ");
        String inputbrand = sc.nextLine();
        // int demo = sc.nextInt();
        no_count = countOfLaptopsByBrand(laptops, inputbrand);
        if(no_count>0)
        {
            System.out.println(no_count);
        }
        else {
            System.out.println("The given brand is not available");
        }
        System.out.print("Enter The Laptop OsType Name: ");
        String inputostype = sc.nextLine();
        // int demo = sc.nextInt();
        Laptop[] arr = searchLaptopByOsType(laptops, inputostype);
        for (Laptop laptop : arr) {
            System.out.println(laptop.getLaptopid());
            System.out.println(laptop.getRating());
            
        }

        
    }
}