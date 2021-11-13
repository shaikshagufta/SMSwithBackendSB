package dxc.b2.t4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dxc.b2.t4.model.Students;



@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

}
