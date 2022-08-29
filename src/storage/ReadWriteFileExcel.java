package storage;

import model.Material;

import java.util.List;

public class ReadWriteFileExcel implements ReadWriteData {
    private static ReadWriteFileExcel instance=null;

    private ReadWriteFileExcel() {
    }

    public static ReadWriteFileExcel getInstance(){
        if (instance == null) instance = new ReadWriteFileExcel();
        return instance;
    }

    @Override
    public List<Material> readData() {
        return null;
    }

    @Override
    public void writeData(List<Material> materialList) {

    }
}