package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
//        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Ivan", "Ivanov", (byte) 20);
        userDao.saveUser("Oleg", "Shmatko", (byte) 25);
        userDao.saveUser("Zhenya", "Fedorov", (byte) 31);
        userDao.saveUser("Igor", "Denisov", (byte) 38);

        userDao.getAllUsers();
//        userDao.removeUserById(1);
//        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}