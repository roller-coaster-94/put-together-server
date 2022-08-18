package kr.co.puttogether.assembly.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssemblyRepository extends JpaRepository<Assembly, Long> {
}
