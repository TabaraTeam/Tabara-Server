package org.example.tabara.notice.repository;
import org.example.tabara.notice.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {

}
