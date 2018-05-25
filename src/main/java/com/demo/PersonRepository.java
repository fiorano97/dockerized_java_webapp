package com.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by geoda on 2018-05-26.
 */
@Repository
interface PersonRepository extends CrudRepository<Person, Long> {
}