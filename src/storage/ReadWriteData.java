package storage;

import model.Material;

import java.util.List;

public interface ReadWriteData {
    List<Material> readData();
    void writeData(List<Material> materialList);
}

