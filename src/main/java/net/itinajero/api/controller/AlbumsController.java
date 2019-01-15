package net.itinajero.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.itinajero.api.entity.Album;
import net.itinajero.api.service.IAlbumService;

@RestController
@RequestMapping("/api")
public class AlbumsController {
	
	@Autowired
	private IAlbumService serviceAlbums;
	
	@GetMapping("/albums")
	public List<Album> buscartodos(){
		return serviceAlbums.findAll();
	}
	
}
