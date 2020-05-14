package ru.gizatullin.EasyPC.videocard;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VideoCardDtoToVideoCardConverter implements Converter<VideoCardDto, VideoCard> {
    @Override
    public VideoCard convert(VideoCardDto videoCardDto) {
        return new VideoCard()
                .setId(videoCardDto.getId())
                .setManufacturer_id(videoCardDto.getManufacturer_id())
                .setModel(videoCardDto.getModel())
                .setVideoMemoryCapacity(videoCardDto.getVideoMemoryCapacity());
    }
}
