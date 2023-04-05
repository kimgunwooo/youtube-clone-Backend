package com.semtleWebGroup.youtubeclone.domain.video.service;

import com.semtleWebGroup.youtubeclone.domain.video.domain.VideoInfo;
import com.semtleWebGroup.youtubeclone.domain.video.dto.VideoRequest;
import com.semtleWebGroup.youtubeclone.domain.video.repository.VideoRepository;
import com.semtleWebGroup.youtubeclone.global.error.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class VideoService {
    private VideoRepository videoRepository;

    public VideoInfo add(VideoRequest dto) {
        return new VideoInfo();
    }

    public VideoInfo get(Integer id) {
        VideoInfo videoInfo = videoRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException(
                        String.format("%d is not found.", id)
                ));
        return videoInfo;
    }
}
