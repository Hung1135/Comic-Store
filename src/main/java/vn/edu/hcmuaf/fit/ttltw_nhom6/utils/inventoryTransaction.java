package vn.edu.hcmuaf.fit.ttltw_nhom6.utils;

public class inventoryTransaction {
    //so luong ton kho co san
    public int availableStock(String id_comic, int stock_quanlity, int damaged_quanlity){
        return stock_quanlity - damaged_quanlity;
    }
}
