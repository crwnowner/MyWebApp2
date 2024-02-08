package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;


import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> index() {
        return userDao.index();
    }

    public User show(int id) {
        return userDao.show(id);
    }

    public void add(User user) {
        userDao.add(user);
    }

    public void delete(int id) {
        userDao.delete(id);
    }

    public void update(int id, @Valid User user) {
        userDao.update(id, user);
    }
}
