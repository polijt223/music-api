package net.itinajero.api.service;

import java.util.List;
import net.itinajero.api.entity.Album;

public interface IAlbumService {
	
	List<Album> findAll();
	
}
