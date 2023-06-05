package com.api.timezone;

import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TimeController {

	public static final String ABBREVIATION = "abbreviation";
	public static final String TIMEZONE = "timezone";
	public static final String DATETIME = "datetime";
	public static final String TIMEZONEURL = "http://worldtimeapi.org/api/timezone/";
	private RestTemplate restTemplate = new RestTemplate();

	@RequestMapping(value = { "/time" })
	public Object getTimeZone(@RequestParam(name = "zone") String zone) {
		try {
			Map<String, String> map = (Map<String, String>) restTemplate.getForObject(TIMEZONEURL + zone, Object.class);

			if (map.get(ABBREVIATION) != null && map.get(DATETIME) != null && map.get(TIMEZONE) != null) {
				Map<String, String> resultMap = new HashMap<String, String>();
				resultMap.put(ABBREVIATION, map.get(ABBREVIATION));
				resultMap.put(DATETIME, map.get(DATETIME));
				resultMap.put(TIMEZONE, map.get(TIMEZONE));

				return resultMap;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "Invalid time zone url";
	}

}
