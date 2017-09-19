package zzzTest.excelLoader.test;

import zzzTest.excelLoader.ExcelColumnTitle;

public class ExcelModel {

    @ExcelColumnTitle("品牌")
    public String brand;

    public int word_type=1;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ExcelModel() {
    }

    public ExcelModel(String brand, int word_type) {
        this.brand = brand;
        this.word_type = word_type;
    }
}