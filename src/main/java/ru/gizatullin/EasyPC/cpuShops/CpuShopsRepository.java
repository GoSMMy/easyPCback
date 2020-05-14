package ru.gizatullin.EasyPC.cpuShops;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CpuShopsRepository extends JpaRepository<CpuShops, Long> {
}
