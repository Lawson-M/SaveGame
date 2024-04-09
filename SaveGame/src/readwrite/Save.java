/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package readwrite;

/**
 *
 * @author ltmer
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Save {
    File save;
    Data data;
    
    public Save(Data x){
        data = x;
    }
    
    public void SaveGame(){
        try{
            FileWriter writer = new FileWriter("BDA_SAVE.txt");
            writer.write(data.save1 + " ");
            writer.write(data.save2 + " ");
            writer.close();
            System.out.println("Game Saved");
            
        }catch (IOException e){
            System.out.println("Error Saving");
        }
    }
   
    public void CreateSave(){
        try{
            save = new File("BDA_SAVE.txt");
            if(save.createNewFile()){
                System.out.println("Save Created");
            }else{
                System.out.println("there's already a save");
            }
        }catch(IOException e){
            System.out.println("Error Creating Save");
        }
        
    }
    
    public void LoadSave(){
        
        try {
            Scanner load = new Scanner(new File("BDA_SAVE.txt"));
            String read;
            while(load.hasNextLine()){
                read = load.nextLine();
                
                String[] line = read.split(" ");
                data.save1 = Integer.parseInt(line[0]);
                data.save2 = Boolean.parseBoolean(line[1]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No Save Data");
        }
        
    }
}
