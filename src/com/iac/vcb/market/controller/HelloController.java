package com.iac.vcb.market.controller;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ValueConstants;

@Controller
public class HelloController {

	// 示例URL：http://localhost:8080/app/hello/name/minerddd/age/30
	@RequestMapping(value = "/hello/name/{userName}/age/{userAge}", method = RequestMethod.GET)
	@ResponseBody
	public String testHello(@PathVariable String userName, @PathVariable int userAge) {
		return String.format("hello:%1s age is %2d", userName, userAge);
	}

	// 示例URL：http://localhost:8080/app/hello2/M=miner,dt;N=nano/th=12
	@RequestMapping(value = "/hello2/{names}/{ages}", method = RequestMethod.GET)
	@ResponseBody
	public String testMatrixVariable(@MatrixVariable(pathVar = "names", required = false, defaultValue = ValueConstants.DEFAULT_NONE) Map<String, List<String>> names, @MatrixVariable(pathVar = "ages", required = false) Map<String, List<String>> ages) {

		StringBuilder str = new StringBuilder();
		if (null != names) {
			Set<Entry<String, List<String>>> iter = names.entrySet();
			str.append("name{");
			for (Entry<String, List<String>> item : iter) {
				str.append(item.getKey() + "==");
				for (String subitem : item.getValue()) {
					str.append(subitem + ",");
				}
				str.append(";");
			}
		}
		str.append("}age{");

		if (null != ages) {
			System.out.println(ages);
			Set<Entry<String, List<String>>> iter2 = ages.entrySet();
			for (Entry<String, List<String>> item : iter2) {
				str.append(item.getKey() + "==");
				for (String subitem : item.getValue()) {
					str.append(subitem + ",");
				}
				str.append(";");
			}
		}
		str.append("}");
		return str.toString();
	}

	

	// 示例：http://localhost:8080/app/ftl
	@RequestMapping(value = "/ftl", method = RequestMethod.GET)
	public String testFreeMark() {		
		return "hello";
	}
	
}
