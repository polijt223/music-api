package net.itinajero.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.itinajero.api.entity.Album;

@Repository
public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
