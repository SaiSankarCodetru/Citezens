package Ext_Excl;

import utils.Excel_Util;

public class Ext_1 {

	Excel_Util x = new Excel_Util();

	//Login page and HomePage
	public String Case(int d) throws Exception {
		String data = x.getCellData(x.path, 1, d, 0);
		return data;
	}

	public String Exp(int d) throws Exception {
		String data = x.getCellData(x.path, 1, d, 1);
		return data;
	}
	//Step1
	public String Case1(int d) throws Exception {
		String data = x.getCellData(x.path, 2, d, 0);
		return data;
	}

	public String Exp1(int d) throws Exception {
		String data = x.getCellData(x.path, 2, d, 1);
		return data;
	}


	//step2 
	public String Case2(int d) throws Exception {
		String data = x.getCellData(x.path, 3, d, 0);
		return data;
	}

	public String Exp2(int d) throws Exception {
		String data = x.getCellData(x.path, 3, d, 1);
		return data;
	}

	//step3 
	public String Case3(int d) throws Exception {
		String data = x.getCellData(x.path, 4, d, 0);
		return data;
	}

	public String Exp3(int d) throws Exception {
		String data = x.getCellData(x.path, 4, d, 1);
		return data;
	}

	//step4
	public String Case4(int d) throws Exception {
		String data = x.getCellData(x.path, 5, d, 0);
		return data;
	}

	public String Exp4(int d) throws Exception {
		String data = x.getCellData(x.path, 5, d, 1);
		return data;
	}

	//step5
	public String Case5(int d) throws Exception {
		String data = x.getCellData(x.path, 6, d, 0);
		return data;
	}

	public String Exp5(int d) throws Exception {
		String data = x.getCellData(x.path, 6, d, 1);
		return data;
	}

	//step6 
	public String Case6(int d) throws Exception {
		String data = x.getCellData(x.path, 7, d, 0);
		return data;
	}

	public String Exp6(int d) throws Exception {
		String data = x.getCellData(x.path, 7, d, 1);
		return data;
	}


	//step7
	public String Case7(int d) throws Exception {
		String data = x.getCellData(x.path, 8, d, 0);
		return data;
	}

	public String Exp7(int d) throws Exception {
		String data = x.getCellData(x.path, 8, d, 1);
		return data;
	}


	//step8 
	public String Case8(int d) throws Exception {
		String data = x.getCellData(x.path, 9, d, 0);
		return data;
	}

	public String Exp8(int d) throws Exception {
		String data = x.getCellData(x.path, 9, d, 1);
		return data;
	}


	//step9
	public String Case9(int d) throws Exception {
		String data = x.getCellData(x.path, 10, d, 0);
		return data;
	}

	public String Exp9(int d) throws Exception {
		String data = x.getCellData(x.path, 10, d, 1);
		return data;
	}

	//step10
	public String Case10(int d) throws Exception {
		String data = x.getCellData(x.path, 11, d, 0);
		return data;
	}

	public String Exp10(int d) throws Exception {
		String data = x.getCellData(x.path, 11, d, 1);
		return data;
	}

	public String data(int sheet, int r, int c) throws Exception {
		String data = x.getCellData(x.path, sheet, r, c);
		return data;
	}
	
	public String Err_Msg(int sheet, int r, int c) throws Exception {
		String data = x.getCellData(x.path, sheet, r, c);
		return data;
	}
}
