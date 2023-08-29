package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class DepartmentTest {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department find by id ===");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n=== TEST 1: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }
    }
}