package co.project.recap.service.impl;

import co.project.common.exception.CommonException;
import co.project.recap.model.User;
import co.project.recap.repository.RecapDao;
import co.project.recap.service.RecapService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RecapServiceImpl implements RecapService {


    @Autowired
    private RecapDao recapMapper;

    /**
     * user API
     */
    @Override
    public void saveUser(User user) throws Exception {

        try {
            //String name = recapMapper.getUser();
            log.info("name  :: " + user.getName());
            log.info("email  :: " + user.getEmail());

        } catch (Exception e) {
            e.printStackTrace();
            throw new CommonException.DefaultParameterException("오류가 발생했습니다.[1]");
        }
    }

}
