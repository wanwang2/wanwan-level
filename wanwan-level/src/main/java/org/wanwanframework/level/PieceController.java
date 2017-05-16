package org.wanwanframework.level;

import java.util.Map;

import org.wanwanframework.file.map.LineTool;
import org.wanwanframwork.file.Log;

public class PieceController {

	//public Map<String, String> pieceMap = new HashMap<String, String>();
	//public Map<String, String> templateMap = new HashMap<String, String>();
	public Map<String, String>[] configs;
	
	private String content = "";
	
	public PieceController() {
		configs = LineTool.getConfigs("./src/main/resources/piece/path.txt", "!", ":");
	}
	
	public void init() {
		Log.log(configs);
		readStructure();
	}
	
	public void readStructure() {
		Map<String, String> map = configs[0];
		for (String key: map.keySet()) {
			content += map.get(key);
		}
		Log.log("content:" + content);
	}
	
	public static void main(String[] args) {
		PieceController PieceController = new PieceController();
		PieceController.init();
	}
}
