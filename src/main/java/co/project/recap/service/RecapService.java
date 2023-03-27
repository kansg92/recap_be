package co.project.recap.service;

import co.project.recap.model.User;
import org.springframework.stereotype.Service;

@Service
public interface RecapService {

    void saveUser(User user) throws Exception;
}
