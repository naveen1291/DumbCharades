package com.dreamerz.controllers;

import com.dreamerz.bean.Video;
import com.dreamerz.interfaces.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by naveen1291 on 26/11/16.
 */
@RestController

public class VideoController {

    @Autowired
    VideoService videoService;

    @GetMapping(path = "/videos", produces = "application/json")
    @CrossOrigin(origins = "*")
    public ResponseEntity getVideo(@RequestParam(value = "uri") String uri) {
        HttpHeaders responseHeaders = new HttpHeaders();

        responseHeaders.set("Access-Control-Allow-Origin", "*");
        responseHeaders.set("Access-Control-Allow-Methods", "GET");
        return new ResponseEntity(new Video(videoService.getVideo(uri)), responseHeaders, HttpStatus.OK);
        /*return ResponseEntity
                .created(location)
                .header("MyResponseHeader", "MyValue")
                .body(new Video(videoService.getVideo(uri)));*/
//       return new Video(videoService.getVideo(uri));
    }

}
