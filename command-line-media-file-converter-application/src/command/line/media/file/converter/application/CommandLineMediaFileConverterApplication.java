/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.line.media.file.converter.application;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Prageeth
 */
public class CommandLineMediaFileConverterApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            
            System.out.println("***** Put The Files In To Media Folder According To Conversion Type You Want ***** \n");

            System.out.println("Select The type you want to Convert : \n\nFor MP4_To_MP3 -> Press 1\nFor MP4_To_FLV -> Press 2 \nFor MP4_To_3GP -> Press 3 \nFor WAV_To_MP3 -> Press 4 \n\nPress The Number : ");
            Scanner convert_type = new Scanner(System.in);

            char ch=convert_type.nextLine().charAt(0);

            if(ch=='1')
            {
                File Video = new File("C:/Users/Prageeth/Desktop/Command line File Convertor App/command-line-media-file-converter-application/media/mp4Tomp3/video.mp4");
                MP4_To_MP3.mp4_to_mp3(Video); 
            }
            if(ch=='2')
            {
                File Video = new File("C:/Users/Prageeth/Desktop/Command line File Convertor App/command-line-media-file-converter-application/media/mp4Tomp3/video.mp4");
                MP4_To_FLV.mp4_to_flv(Video);
            }
            if(ch=='3')
            {
                File Video = new File("C:/Users/Prageeth/Desktop/Command line File Convertor App/command-line-media-file-converter-application/media/mp4To3gp/video.mp4");
                MP4_To_3GP.mp4_to_3gp(Video);
            }
            if(ch=='4')
            {
                File Audio = new File("C:/Users/Prageeth/Desktop/Command line File Convertor App/command-line-media-file-converter-application/media/wavTomp3/audio.wav");
                WAV_To_MP3.wav_to_mp3(Audio);
            }
            else
            {
                System.err.println("wrong selection");
            }
        
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
