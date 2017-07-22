package com.textprocessor;

import org.junit.Assert;
import org.junit.Test;


public class TestHighlightKeywords {
	
	private final static String tag = "[blue]";
	

	@Test
	public void testGetHighlightTextByTag(){
		
		String expected = "hey there, [blue]we[blue] [blue]are[blue] very much [blue]happy[blue]";
		String token = " ";
		String keywords = "we are happy";
		String sampleData = "hey there, we are very much happy";
		
		KeywordHighlighter keywordHighlighter = new KeywordHighlighter();
		String actual = keywordHighlighter.getHighlightedTextByTag( sampleData,  keywords, tag, token);
		
		Assert.assertEquals(expected, actual);
	}
}
