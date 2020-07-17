/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.line.media.file.converter.application;

import java.io.File;
import it.sauronsoftware.jave.*;

/**
 *
 * @author Prageeth
 */
public class MP4_To_MP3 {
    
    public static void mp4_to_mp3 (File video)
    {
        System.err.println("Start Converting.....");
        File Audio = new File("C:\\Users\\Prageeth\\Desktop\\Command line File Convertor App\\command-line-media-file-converter-application\\media-converted\\mp4Tomp3-converted\\Audio.mp3");
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("mp2");
        audio.setBitRate(new Integer (128000));
        audio.setChannels(new Integer(2));
        audio.setSamplingRate(new Integer (44100));
        
        EncodingAttributes attr = new EncodingAttributes ();
        attr.setFormat("mp3");
        attr.setAudioAttributes(audio);
        
        Encoder encode = new Encoder();
        try{
           encode.encode(video, Audio, attr);
           System.err.println("Convert Finished...!!!");
           System.out.println("\n\n***** You Can Find The Converted File in Media-Converted *****\n\n");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
}
