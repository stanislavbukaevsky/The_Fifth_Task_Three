package ru.hogwarts.schoolfour.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.schoolfour.Model.Avatar;

import java.util.Optional;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {
    Optional<Avatar> findByStudentId(Long studentId);
}
