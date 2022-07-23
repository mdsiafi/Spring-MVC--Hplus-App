package com.test.hplus.repository;

import com.test.hplus.beans.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer> {

    @Query("select u from UserModel u where u.username= :name")
    public UserModel searchByName(@Param("name") String username);

}
