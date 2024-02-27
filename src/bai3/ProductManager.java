package bai3;

import bai2.Bao;
import bai2.Sach;
import bai2.TaiLieu;
import bai2.TapChi;

import java.util.Arrays;
import java.util.Scanner;

public class ProductManager {
    Product product;

//    public void createProduct (){
//        Product p = new Product();
//
//    }

    public Product[] listP ;

    public int size=0;
    private Scanner sc;

    public ProductManager(Scanner sc){
        super();
        listP = new Product[0];
        this.sc = sc;
    }
    public void addP(Product p){
        Product[] newlistP = Arrays.copyOf(listP,listP.length+1);
        newlistP[size]=p;
        listP=newlistP;
        size++;
    }

    public void addProduct(){
        Product[] newlistP = Arrays.copyOf(listP,listP.length+1);
        newlistP[size]=createProduct();
        listP=newlistP;
        size++;
    }

    private Product createProduct(){
        Product p;
        System.out.print("Enter id : ");
        Long id = Long.parseLong(sc.nextLine());
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter price : ");
        Double price =Double.parseDouble(sc.nextLine());
        System.out.print("Enter số quantity : ");
        int quantity =Integer.parseInt(sc.nextLine());
        System.out.print("Enter category : ");
        String category =sc.nextLine();
        Category c = new Category(category);
        p = new Product(id,name,price,quantity,c);
        return p;
    }

    public void updateProduct (Long id){
        boolean check = false;
        for (int i=0;i<size-1;i++){
            if (listP[i].getId().equals(id)){
                Product p;
                System.out.print("Update id : ");
                Long newid = Long.parseLong(sc.nextLine());
                System.out.print("Update name : ");
                String newname = sc.nextLine();
                System.out.print("Update price : ");
                Double newprice =Double.parseDouble(sc.nextLine());
                System.out.print("Update số quantity : ");
                int newquantity =Integer.parseInt(sc.nextLine());
                System.out.print("Update category : ");
                String newcategory =sc.nextLine();
                Category newc = new Category(newcategory);
                p = new Product(newid,newname,newprice,newquantity,newc);
                listP[i] =p;
                check=true;
                break;
            }
            if(check) System.out.println("Id khong ton tai!");
        }
    }

    public void deleteProduct (Long id){
        String maTaiLieu;
        int count=0;
        boolean check =false;

        Product[] newlistP = new Product[size-1];
            for ( int i=0,j=0;i<size & j<size-1;i++,j++){
                if (listP[i].getId().equals(id)){
                    j--;
                    count++;
                    check=true;
                    continue;
                }
                newlistP[j]=listP[i];
            }
            listP = newlistP;
            size=size-count;
            if (check) System.out.println("Successful deletion");
            else System.out.println("Id does not exist");
    }
    public void displayProduct(Long id){
        for (Product p : listP){
            if(p.getId().equals(id))
                if (p != null) System.out.println(p.toString());
        }
    }

    public void displayListProduct() {
        for (Product p : listP) {
            if (p != null) {
                System.out.println(p.toString());
            }
        }
    }

    public void displayProductCategory(String category){
        for (Product p : listP){
            if(p.getCategory().getName().equals(category))
                if (p != null) System.out.println(p.toString());
        }
    }

    public void sumPriceProduct(){
        Double sum=0.0;
        for (Product p : listP){
            System.out.println(p.getPrice());
            sum += p.getPrice();
        }
        System.out.println("total product price : "+sum);
    }

    public void moreThan100000(){
        for (Product p : listP){
            if(p.getPrice()>100000)
                if (p != null) System.out.println(p.toString());
        }
    }
    public void moreThan200000DienTu(){
        for (Product p : listP){
            if(p.getPrice()>100000 && p.getCategory().getName().equals("Dien tu"))
                if (p != null) System.out.println(p.toString());
        }
    }
}
