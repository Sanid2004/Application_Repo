package com.example.app.Service;

import com.example.app.Entities.User;

public class User_Service_Impl implements Users_Service {
    @Override
    public String get_query() {
        return "SELECT \n" +
                "    p.AMOUNT AS SALARY,\n" +
                "    CONCAT(e.FIRST_NAME, ' ', e.LAST_NAME) AS NAME,\n" +
                "    TIMESTAMPDIFF(YEAR, e.DOB, CURDATE()) AS AGE,\n" +
                "    d.DEPARTMENT_NAME\n" +
                "FROM PAYMENTS p\n" +
                "JOIN EMPLOYEE e ON p.EMP_ID = e.EMP_ID\n" +
                "JOIN DEPARTMENT d ON e.DEPARTMENT = d.DEPARTMENT_ID\n" +
                "WHERE DAY(p.PAYMENT_TIME) != 1\n" +
                "ORDER BY p.AMOUNT DESC\n" +
                "LIMIT 1;";
    }

    @Override
    public User add_user(User user) {
        User u = User.builder().name("John Doe").regNo("REG12347").email("john@example.com").build();
        return u;
    }
}
