package com.dreamerz.interfaces;

import org.springframework.stereotype.Service;

/**
 * Created by naveen1291 on 26/11/16.
 */


public interface VideoService {
    String getVideo(String uri);

    String saveVideo(String base64EncodedData);
}

