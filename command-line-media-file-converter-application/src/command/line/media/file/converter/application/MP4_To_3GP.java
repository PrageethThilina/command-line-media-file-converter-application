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
public class MP4_To_3GP {
    
     public static void mp4_to_3gp (File video)
    {
        System.err.println("Start Converting.....");
        File Video = new File("C:\\Users\\Prageeth\\Desktop\\Command line File Convertor App\\command-line-media-file-converter-application\\media-converted\\mp4To3gp-converted\\video.3gp");
        
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libfaac");
        audio.setBitRate(new Integer(128000));
        audio.setSamplingRate(new Integer(44100));
        audio.setChannels(new Integer(2));

        VideoAttributes va = new VideoAttributes();
        va.setCodec("mpeg4");
        va.setBitRate(new Integer(160000));
        va.setFrameRate(new Integer(15));
        va.setSize(new VideoSize(176, 144));
        
        EncodingAttributes attr = new EncodingAttributes();
        attr.setFormat("3gp");
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
