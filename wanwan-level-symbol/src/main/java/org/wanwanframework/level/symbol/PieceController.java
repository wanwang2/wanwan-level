package org.wanwanframework.level.symbol;

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
		//Log.log(configs);
		readStructure();
	}
	
	public void readStructure() {
		Map<String, String> map = configs[0];
		Map<String, String> templateMap = configs[1];
		for (String key: map.keySet()) {
			String line = map.get(key);
			String template = readTemplate(templateMap, "->");
			content += readSymbol(line, "->", template);
		}
		Log.log("content:\r\n" + content);
	}
	
	public String readTemplate(Map<String, String> map, String key) {
		return map.get(key);
	}
	
	public String readSymbol(String line, String key, String template) {
		if(line.contains(key)) {
			line = line.replaceAll(key, template);
		}
		return line;
	}
	
	public static void main(String[] args) {
		PieceController PieceController = new PieceController();
		PieceController.init();
	}
}
