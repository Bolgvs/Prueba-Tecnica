package service;

import java.util.List;

import dto.Video;

public class IVideojuegoService {
	
	public List<Video> listVideo();
	
	public List<Video> VideoByName(String name);
	
	public Video createVideo(Video video);
	
	public Video VideoById(Long id);
	
	public void deleteVideo(Long id);
	
	public Video updateVideo(Video video);
}
