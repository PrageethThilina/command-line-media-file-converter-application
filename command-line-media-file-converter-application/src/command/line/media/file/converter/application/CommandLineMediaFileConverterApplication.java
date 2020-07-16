/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.line.media.file.converter.application;

import java.io.File;

/**
 *
 * @author Prageeth
 */
public class CommandLineMediaFileConverterApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File Video = new File("C:/Users/Prageeth/Desktop/Command line File Convertor App/command-line-media-file-converter-application/Source Folder/mp4Tomp3/10.mp4");
        MP4_To_MP3.mp4_to_mp3(Video);
    }
    
}
