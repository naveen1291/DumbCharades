package com.dreamerz.impl;

import com.dreamerz.interfaces.VideoService;
import com.dreamerz.util.FileUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

/**
 * Created by naveen1291 on 26/11/16.
 */

@Service
public class videoServiceImpl implements VideoService {
    @Override
    public String getVideo(String uri) {
        if (StringUtils.isNotBlank(uri)) {
            File file = new File(uri);
            try {
                return FileUtil.convertFileToString(file);
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        } else {
            return "";
        }
    }


    @Override
    public String saveVideo(String base64EncodedData) {
        return null;
    }
}
