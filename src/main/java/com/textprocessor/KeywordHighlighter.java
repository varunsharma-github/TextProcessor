package com.textprocessor;

public class KeywordHighlighter {

	public String getHighlightedTextByTag(String sampledata, String keywords, String tag, String token) {
		
		String[] keywordsArry = keywords.split(token);

		for (String keyword : keywordsArry) {
			sampledata = sampledata.replaceAll(keyword, tag+keyword+tag);
		}
		
		return sampledata;
	}
	
}
