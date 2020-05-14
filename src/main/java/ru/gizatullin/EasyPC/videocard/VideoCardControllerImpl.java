package ru.gizatullin.EasyPC.videocard;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/video-card")
@RequiredArgsConstructor
public class VideoCardControllerImpl implements VideoCardController {
    private final VideoCardService videoCardService;

    @Override
    @PostMapping
    public VideoCardDto add(@RequestBody VideoCardDto videoCardDto) {
        return videoCardService.add(videoCardDto);
    }

    @GetMapping
    @Override
    public ResponseEntity<List<VideoCardDto>> getAll() {
        return ResponseEntity.ok(videoCardService.getAll());
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello, world!", HttpStatus.BAD_GATEWAY);
    }

    @GetMapping("/{id}")
    @Override
    public VideoCardDto get(@PathVariable("id") long id) {
        return videoCardService.get(id);
    }

    @PutMapping
    @Override
    public VideoCardDto update(@RequestBody VideoCardDto videoCardDto) {
        return videoCardService.update(videoCardDto);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable("id") long id) {
        videoCardService.delete(id);
    }
}
