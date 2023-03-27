package co.project.recap.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RecapDao {
    String getUser() throws Exception;
}