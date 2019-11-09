package com.sm43.SpringJPAPostgreSQL.repo;

import com.sm43.SpringJPAPostgreSQL.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
