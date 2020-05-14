package ru.gizatullin.EasyPC.videocard;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VideoCardServiceImpl implements VideoCardService {
    private final VideoCardRepository videoCardRepository;
    private final VideoCardToVideoCardDtoConverter videoCardToVideoCardDtoConverter;
    private final VideoCardDtoToVideoCardConverter videoCardDtoToVideoCardConverter;

    @Override
    public List<VideoCardDto> getAll() {
        return videoCardRepository.findAll().stream()
                .map(videoCard -> videoCardToVideoCardDtoConverter.convert(videoCard))
                .collect(Collectors.toList());
    }

    @Override
    public VideoCardDto get(long id) {
        VideoCard videoCard = videoCardRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return videoCardToVideoCardDtoConverter.convert(videoCard);
    }

    @Override
    public VideoCardDto update(VideoCardDto videoCardDto) {
        VideoCard videoCard = videoCardRepository.save(videoCardDtoToVideoCardConverter.convert(videoCardDto));
        return videoCardToVideoCardDtoConverter.convert(videoCard);
    }

    @Override
    public VideoCardDto add(VideoCardDto videoCardDto) {
        VideoCard videoCard = videoCardRepository.save(videoCardDtoToVideoCardConverter.convert(videoCardDto));
        return videoCardToVideoCardDtoConverter.convert(videoCard);
    }

    @Override
    public void delete(long id) {
        videoCardRepository.deleteById(id);
    }
}
