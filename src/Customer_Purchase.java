import java.util.Scanner;

public class Customer_Purchase {
    public static void main(String[] args) {
        String Customer_name;
        double purchase_amount;
        int tax_code;
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");
        Customer_name=scanner.nextLine();
        System.out.println("please enter your total purchase amount");
        purchase_amount=scanner.nextDouble();
        System.out.println("please enter the tax code");
        tax_code=scanner.nextInt();
          double sales;
        // it is very easy if we use switch for this problem

            if(tax_code==0) {
                sales = 0.0;
                System.out.println("Customer_name " + Customer_name);
                System.out.println("tax sales :" + sales);
                System.out.println("total Due: " + (sales * purchase_amount));
            }
            else if(tax_code==1){
                sales=3.0/100.0;
                System.out.println("Customer_name " + Customer_name);
                System.out.println("tax sales :" + sales);
                System.out.println("total Due: " + (sales * purchase_amount));
            }
            else if(tax_code==2){
                sales=5.0/100.0;
                System.out.println(11/2);
                System.out.println("Customer_name " + Customer_name);
                System.out.println("tax sales :" + sales);
                System.out.println("total Due: " + (sales * purchase_amount));
            }
            else if(tax_code==3){
                sales=7.0/100.0;
                System.out.println("Customer_name " + Customer_name);
                System.out.println("tax sales :" + sales);
                System.out.println("total Due: " + (sales * purchase_amount));
            }
            else{
                System.out.println("please enter the correct tax code");
                System.exit(0);
            }
    }
}
