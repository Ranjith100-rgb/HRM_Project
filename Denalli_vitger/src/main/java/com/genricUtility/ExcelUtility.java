package com.genricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getExcelDataFromProperty(String filePath, String sheetName, String TestID, String ColHeader)
			throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream(filePath));
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		String actTestID = "";
		String actColName = "";
		int testRowNum = 0;
		for (int i = 0; i <= rowCount; i++) {
			actTestID = sheet.getRow(i).getCell(0).toString();
			if (actTestID.equals(TestID)) {
				break;
			}
			testRowNum++;
		}
		int testColNum = 0;
		int cellCount = sheet.getRow(testRowNum - 1).getLastCellNum();
		System.out.println(cellCount);
		for (int j = 0; j < cellCount; j++) {
			actColName = sheet.getRow(testRowNum - 1).getCell(j).toString();
			System.out.println(actColName);
			if (actColName.equals(ColHeader)) {
				break;
			}
			testColNum++;
		}

		String data = sheet.getRow(testRowNum).getCell(testColNum).toString();
		return data;

	}

}
