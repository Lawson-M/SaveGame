/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package readwrite;

/**
 *
 * @author ltmer
 */
public class Data {
    
    int save1;
    boolean save2;
    
    public Data (int x, boolean y){
            save1=x;
            save2=y;
            Save save = new Save(this);
            //save.CreateSave();
            save.SaveGame();
            save.LoadSave();
            System.out.println(save1);
            System.out.println(save2);
    }
}
