package web.service;

import web.model.User;


import javax.validation.Valid;
import java.util.List;

public interface UserService {

    void add(User user);
    List<User> index();
    User show(int id);
    void delete(int id);
    void update(int id, User user);
}
