package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        System.out.println("=== TEST 1: seller findById ======");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        Department department = new Department(2,null);
        System.out.println("\n=== TEST 2: seller findById ======");
        List<Seller> list =  sellerDao.findByDepartment(department);
        for (Seller obj:
             list) {
            System.out.println(obj);
        }

    }
}