package controller;

import model.CrispyFlour;
import model.Discount;
import model.Material;
import storage.ReadWriteData;
import storage.ReadWriteFile;
import storage.ReadWriteFileExcel;

import java.util.List;

public class MaterialManager {
    private ReadWriteData readWriteData = ReadWriteFileExcel.getInstance();

    public List<Material> materialList = readWriteData.readData();

    public void getChieuKhau(){
        for (int i = 0; i < materialList.size(); i++) {
            if (materialList.get(i) instanceof Discount){
                ((Discount)materialList.get(i)).getRealMoney();
            }
        }
    }

    public void addNewMaterial(Material material){
        materialList.add(material);
        readWriteData.writeData(materialList);
    }

    public void editMaterialByIndex(int index, Material material){
        materialList.set(index, material);
        readWriteData.writeData(materialList);
    }
}
