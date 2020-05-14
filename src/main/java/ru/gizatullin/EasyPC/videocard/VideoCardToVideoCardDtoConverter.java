package ru.gizatullin.EasyPC.videocard;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VideoCardToVideoCardDtoConverter implements Converter<VideoCard, VideoCardDto> {
    @Override
    public VideoCardDto convert(VideoCard videoCard) {
        return new VideoCardDto()
                .setId(videoCard.getId())
                .setManufacturer_id(videoCard.getManufacturer_id())
                .setModel(videoCard.getModel())
                .setVideoMemoryCapacity(videoCard.getVideoMemoryCapacity());
    }
}
