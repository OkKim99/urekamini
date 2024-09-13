package com.uplus.miniproject2.repository;

import com.uplus.miniproject2.entity.proflie.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MapRepository extends JpaRepository<Profile, Long> {
    // 특정 사용자 ID로 프로필 조회
    Optional<List<Profile>> findByUserId(Long userId);
}
