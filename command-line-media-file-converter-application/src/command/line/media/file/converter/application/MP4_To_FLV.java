/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.line.media.file.converter.application;

import it.sauronsoftware.jave.*;
import java.io.File;

/**
 *
 * @author Prageeth
 */
public class MP4_To_FLV {
    
    public static void mp4_to_flv (File video)
    {
        System.err.println("Start Converting.....");
        File Video = new File("C:\\Users\\Prageeth\\Desktop\\Command line File Convertor App\\command-line-media-file-converter-application\\media-converted\\mp4Toflv-converted\\video.flv");
        
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(new Integer(64000));
        audio.setChannels(new Integer(1));
        audio.setSamplingRate(new Integer(22050));
        
        VideoAttributes va = new VideoAttributes();
        va.setCodec("flv");
        va.setBitRate(new Integer(160000));
        va.setFrameRate(new Integer(15));
        va.setSize(new VideoSize(400, 300));
        
        EncodingAttributes attr = new EncodingAttributes();
        attr.setFormat("flv");
        attr.setAudioAttributes(audio);
        attr.setVideoAttributes(va);
        
        Encoder encoder = new Encoder();
        
        try{
           encoder.encode(video, Video, attr);
           System.err.println("Convert Finished...!!!");
           System.out.println("\n\n***** You Can Find The Converted File in Media-Converted *****\n\n");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
}
