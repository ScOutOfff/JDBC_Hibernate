package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
//        Util.getConnection();
        UserServiceImpl userService = new UserServiceImpl();
//        UserDao userDao = new UserDaoJDBCImpl();

        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 20);
        userService.saveUser("Oleg", "Shmatko", (byte) 25);
        userService.saveUser("Zhenya", "Fedorov", (byte) 31);
        userService.saveUser("Igor", "Denisov", (byte) 38);

        userService.getAllUsers();
//        userDao.removeUserById(1);
//        userDao.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
