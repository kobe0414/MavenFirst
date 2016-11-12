package com.mavenTest.service;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Service;

@Service
public class ExcelServiceImpl implements ExcelService {

	public void writeToExcel(HttpServletResponse response) {
		// TODO Auto-generated method stub
		SXSSFWorkbook workbook = new SXSSFWorkbook(500);
		Sheet sheet = workbook.createSheet("表格1");
		String[] excelColsName = {"列1","列2","列3"};
		createTitle(sheet, excelColsName);
		Row row = sheet.createRow(1);
		for(int i = 0 ; i < 3 ;i ++){
			Cell cell = row.createCell(i);
			cell.setCellValue(i);
		}
		write("表格.xlsx", response, workbook);
	}
	
	/**
     * 写回浏览器
     * @param filename
     * @param response
     * @param wb
     */
    private void write(String filename, HttpServletResponse response, SXSSFWorkbook wb){
        try {

            response.setContentType("application/x-msdownload;charset=GBK");
            response.setHeader("Content-Disposition", "attachment;filename="
                    + new String(filename.getBytes("GBK"), "ISO8859_1"));
            wb.write(response.getOutputStream());
            response.getOutputStream().flush();
            response.getOutputStream().close();
        } catch (IOException e) {
            
        }finally {
            //wb.dispose();
            try {
                wb.close();
            } catch (IOException e) {
                
            }
        }
    }

	private void createTitle(Sheet sheet, String[] excelColsName) {
        Row row = sheet.createRow(0);
        for (int i = 0; i < excelColsName.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(excelColsName[i]);
        }
    }
}
