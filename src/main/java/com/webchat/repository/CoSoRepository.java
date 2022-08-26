package com.webchat.repository;

import com.webchat.model.CoSo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CoSoRepository extends JpaRepository<CoSo, String> {

    @Query(value = "select ten_co_so from co_so", nativeQuery = true)
    List<String> listCoSo();
}
