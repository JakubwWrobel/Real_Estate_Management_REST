package com.sparrowsanta.real_estate_management_rest.room;

import com.sparrowsanta.real_estate_management_rest.standardJpa.AbstractBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends AbstractBaseRepository<Room, Long> {

    List<Room> findAllByFlatId(long flatId);

    @Query(value = "SELECT r.picUrl FROM Room r WHERE r.id = ?1")
    byte[] picUrlById(long id);
}
