package orgtk.Utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {
    XSSFWorkbook workbook = null;
    XSSFSheet sheet = null;
    XSSFRow headerRow = null;
    XSSFRow row = null;
    XSSFCell cell = null;
    int colNum = 0;
    int rowCount = 0;
    List<String> columnData = new ArrayList<>();
    FileInputStream fis = null;


    public ExcelUtils (String filepath){
        try {
            fis= new FileInputStream(filepath);
            workbook = new XSSFWorkbook(fis);
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public List<String> readExcelData(String sheetName, String columName){
        sheet = workbook.getSheet(sheetName);
        headerRow = sheet.getRow(0);
        rowCount =sheet.getLastRowNum() - sheet.getFirstRowNum();
        for (int j=1;j<=rowCount;j++){
            row = sheet.getRow(j);
            for (int i=0;i<row.getLastCellNum();i++){
                if (headerRow.getCell(i).getStringCellValue().trim().equals(columName.trim()))
                    colNum=i;
            }
            cell = row.getCell(colNum);
            String value = cell.getStringCellValue();
            columnData.add(value);

        }
        return columnData;

    }

}
