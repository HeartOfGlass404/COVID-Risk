package adianov.sergei.covidrisk;



import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

public class CreateWorkbook {
    public static void Create() throws Exception{
        XSSFWorkbook workbook = new XSSFWorkbook();

        FileOutputStream out = new FileOutputStream(new File("workbook.xlsx"));

        workbook.write(out);
        out.close();
        System.out.println("Sucess!");
    }
}
