package ru.gizatullin.EasyPC.videocard;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VideoCardService {
    List<VideoCardDto> getAll();

    VideoCardDto get(long id);

    VideoCardDto update(VideoCardDto videoCardDto);

    void delete(long id);

    VideoCardDto add(VideoCardDto videoCardDto);
}
