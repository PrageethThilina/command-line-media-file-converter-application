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
public class WAV_To_MP3 {
    
     public static void wav_to_mp3 (File audio)
    {
        System.err.println("Start Converting.....");
        File Audio = new File("C:\\Users\\Prageeth\\Desktop\\Command line File Convertor App\\command-line-media-file-converter-application\\media-converted\\wavTomp3-converted\\audio.mp3");
        
        AudioAttributes adio = new AudioAttributes();
        
        adio.setCodec("libmp3lame");
        adio.setBitRate(new Integer(128000));
        adio.setChannels(new Integer(2));
        adio.setSamplingRate(new Integer(44100));
        
        EncodingAttributes attr = new EncodingAttributes();
        attr.setFormat("mp3");
        attr.setAudioAttributes(adio);
        
        Encoder encoder = new Encoder();
        
        try{
           encoder.encode(audio, Audio, attr);
           System.err.println("Convert Finished...!!!");
           System.out.println("\n\n***** You Can Find The Converted File in Media-Converted Folder *****\n\n");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
