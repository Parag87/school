package com.allstate.repositories;

import com.allstate.entities.Teacher;
import com.allstate.enums.Gender;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by localadmin on 30/01/17.
 */
public interface ITeacherRepository extends CrudRepository<Teacher,Integer> {

    List<Teacher> findByGender(Gender gender);

    List<Teacher> findByAgeGreaterThanEqual(int age);

    String sql2 = "select m.klassid from klassmapping m left join klasses k on k.id = m.klassid where m.teacherid = :teacherId";
    @Query(value = sql2, nativeQuery = true)
    public List<String> getAllKlasses(@Param("teacherId") int teacherId);
}
