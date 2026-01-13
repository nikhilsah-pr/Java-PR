import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bill
{
    public static void header()
    {}
    public static void time()
    {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss" );
        System.out.println("Receipt Date & Time : "+now.format(formatter));
    }
    public static void welcome()
    {
        System.out.println("------------------------------------------------");
        System.out.println("                 SMART STORE                   ");
        System.out.println("------------------------------------------------");
        System.out.println(" Address : Bistupur, Jamshedpur");
        System.out.println(" Contact : 0657-976976");
        System.out.println(" GSTIN   : 20ABCDE1234F1Z5");
        System.out.println("------------------------------------------------");
    }
    public static void items()
    {
        System.out.println("| ID | Product Name | Price     | Quantity  |\r");
        System.out.println("| -- | ------------ | --------- | --------  |\r");
        System.out.println("| 1  | Pen          | 10        | 50        |\r");
        System.out.println("| 2  | Notebook     | 50        | 30        |\r");
        System.out.println("| 3  | Pencil       | 5         | 100       |\r");
        System.out.println("| 4  | Eraser       | 3         | 80        |\r");
        System.out.println("| 5  | Marker       | 25        | 40        |\r");
        System.out.println("| 6  | Scale        | 15        | 60        |\r");
        System.out.println("| 7  | Sharpener    | 7         | 70        |\r");
        System.out.println("| 8  | File Folder  | 30        | 20        |\r");
        System.out.println("| 9  | Highlighter  | 40        | 30        |\r");
        System.out.println("| 10 | Stapler      | 120       | 10        |\r");
        System.out.println("| -- | ------------ | --------- | --------  |\r");

    }
    public static class Parcel {
    public int sum;
    public Double tt;
    public String arn[];
    public int arq[];
    public int arp[];
    public int ap[];
    public int n;
    public int count;
    public Parcel(int sum, Double tt, String arn[], int arq[], int arp[], int ap[], int n)
    {
        this.sum=sum;
        this.tt=tt;
        this.arn=arn;
        this.arq=arq;
        this.arp=arp;
        this.ap=ap;
        this.n=n;

    }
    }
    
    public static Parcel qty()
    {
        Scanner in=new Scanner(System.in);
        int arri[] ={1,2,3,4,5,6,7,8,9,10};
        String arrn[]={"Pen","Notebook","Pencil","Eraser","Marker","Scale","Sharpener","File Folder","Highlighter","Stapler"};
        int arrp[]={10,50,5,3,25,15,7,30,40,120};
        int arrq[]={50,30,100,80,40,60,70,20,30,10};
        String arn[]=new String[50];
        int arq[]=new int[50];
        int arp[]=new int[50];
        int ap[]=new int[50];
        int n=0;
        System.out.println("Enter the quantity of items to be billed: ");
        int x;
        int q=0;
        int q1;
        int sum=0;
        Double tt;
        x=in.nextInt();
        for(int i=1;i<=x;i++)
        {           
            System.out.println("Enter product ID for item \" + (i + 1) + \" in your cart: ");
            q=in.nextInt();
            arn[n]=arrn[q-1];
            
            System.out.println("Enter no of "+arrn[q-1]+" quantities");
            q1=in.nextInt();
            arq[n]=q1;
            ap[n]=arrp[q-1];
            arp[n]=arrp[q-1]*q1;
            System.out.println("price of this product of "+q1+" qty is "+(arrp[q-1]*q1)+" rupees");
            sum+=(arrp[q-1]*q1);
            n++;
        }
    
        tt=sum+(sum*0.05);
        //System.out.println("Your total Bill Without tax is = "+sum);
        //System.out.println("Your bill with 5% GST is : "+tt);
        return new Parcel(sum, tt, arn, arq, arp, ap, n);
    }
    public static void invoice()
    {
        Parcel result = Bill.qty();
        System.out.println("Purchase Details");
        for(int i=0;i<result.n;i++)
        {
            System.out.println(result.arn[i]+" x "+result.arq[i]+" @ "+result.ap[i]+" = "+result.arp[i]);
        }
        System.out.println("Subtotal (excluding tax): ₹"+(result.sum));
        System.out.println("Gross amount (5% GST included): ₹"+(result.tt));
       
    }
    public static void main(String[] args)
    {
        Scanner in =new Scanner (System.in); 
        //Bill.time();
        //Bill.welcome();
        Bill.items();
        Bill.invoice();
        System.out.println("end");

    }
}
