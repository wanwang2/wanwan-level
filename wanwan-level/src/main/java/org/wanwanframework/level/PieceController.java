package org.wanwanframework.level;

import java.util.HashMap;
import java.util.Map;

import org.wanwanframework.file.map.LineTool;
import org.wanwanframwork.file.Log;

public class PieceController {

	public Map<String, String> pieceMap = new HashMap<String, String>();
	public Map<String, String> templateMap = new HashMap<String, String>();
	public Map<String, String>[] configs;
	
	public PieceController() {
		configs = LineTool.getConfigs("./src/main/resources/piece/path.txt", "!", ":");
	}
	
	public void init() {
		Log.log(configs);
	}
	
	public static void main(String[] args) {
		PieceController PieceController = new PieceController();
		PieceController.init();
	}
}
