package com.kh.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class APIService {

	@Value("${http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty}")
	private String baseUrl;
	
	@Value("${chhhqGBatZsP6ae8Uboih2pfs64H5CIRZ2n1ahB0LZnsCRDl2OgHRsRsc+pY+aFAMtsuti/GGew264xwZEQrOw==}")
	private String apikey;
	
	@Value("${application/json}")
	private String contentType;
	
	public String getAirData() throws Exception{
		String url =baseUrl;
		url += "?serviceKey=" + URLEncoder.encode(apikey,"UTF-8");
		url += "&sidoName=" + URLEncoder.encode("서울","UTF-8");
		url += "&returnType=xml";		
		
		URL requestUrl = new URL(url);
		HttpURLConnection uc = (HttpURLConnection) requestUrl.openConnection();
		uc.setRequestMethod("GET");
		uc.setRequestProperty("content-Type", contentType);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
		StringBuilder response = new StringBuilder();
		String line;
		
		while((line=br.readLine())!= null) {
			response.append(line);
		}
		
		br.close();
		uc.disconnect();
		
		return "";
		
	}
	
}
