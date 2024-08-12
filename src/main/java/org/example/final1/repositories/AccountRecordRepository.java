package org.example.final1.repositories;

import org.example.final1.entities.AccountRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRecordRepository extends JpaRepository<AccountRecord,Long> {
}
