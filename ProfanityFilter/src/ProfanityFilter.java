import java.util.HashSet;
import java.util.Set;


public class ProfanityFilter {
	
	
	/**
	 * Sanitize a given message by removing all the abusing words from the message. 
	 *
	 * @param  LanguageType  input string language
	 * @param  String  message which you want to sanitize
	 * @return sanitized message
	 */
	public static String sanitize(final LanguageType languageType,final String message) {
		Set<String> blackList = getBlackListData(languageType);
		String[] words = message.split(" ");
		int wordsLength = words.length;
		for (int i=0;i < wordsLength;i++) {
			if(blackList.contains(words[i].toLowerCase())) {
				words[i] = "###";
			}
		}
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(word+" ");
		}
		return sb.toString();
		
		
	}

	/**
	 * Return a blacklist as per given language
	 *
	 * @param  LanguageType  input string language
	 * @return a set of blacklisted words
	 */
	private static Set<String> getBlackListData(LanguageType languageType) {
		Set<String> blackList = null;
		
		switch (languageType) {
        case ENGLISH: 
        	blackList = getBlackListEnglish();
            break;
        case HINDI: 
        	blackList = getBlackListHindi();
            break;
        case FRENCH: 
        	blackList = getBlackListFrench();
            break;
        case SPANISH: 
        	blackList = getBlackListSpanish();
            break;
        case ARABIC: 
        	blackList = getBlackListArabic();
            break;
        case GERMAN: 
        	blackList = getBlackListGerman();
            break;
        case JAPANESE: 
        	blackList = getBlackListJapanese();
            break;
        case ITALIAN: 
        	blackList = getBlackListItalian();
            break;
        case RUSSIAN: 
        	blackList = getBlackListRussian();
            break;
        case CHINESE: 
        	blackList = getBlackListChinese();
            break;
        default: 
        	blackList = getBlackListEnglish();
            break;
    }
		return blackList;
	}

	/*
	 *  individual methods for blacklists
	 */
	private static Set<String> getBlackListChinese() {
		Set<String> blackListChinese = new HashSet<String>();
		blackListChinese.add("坏蛋");
		return blackListChinese;
	}

	private static Set<String> getBlackListRussian() {
		Set<String> blackListRussian = new HashSet<String>();
		blackListRussian.add("негодяй");
		return blackListRussian;
	}

	private static Set<String> getBlackListItalian() {
		Set<String> blackListItalian = new HashSet<String>();
		blackListItalian.add("mascalzone");
		return blackListItalian;
	}

	private static Set<String> getBlackListJapanese() {
		Set<String> blackListJapanese = new HashSet<String>();
		blackListJapanese.add("野郎");
		return blackListJapanese;
	}

	private static Set<String> getBlackListGerman() {
		Set<String> blackListGerman = new HashSet<String>();
		blackListGerman.add("schlingel");
		return blackListGerman;
	}

	private static Set<String> getBlackListArabic() {
		Set<String> blackListArabic = new HashSet<String>();
		blackListArabic.add("الوغد");
		return blackListArabic;
	}

	private static Set<String> getBlackListSpanish() {
		Set<String> blackListSpanish = new HashSet<String>();
		blackListSpanish.add("bribón");
		return blackListSpanish;
	}

	private static Set<String> getBlackListFrench() {
		Set<String> blackListFrench = new HashSet<String>();
		blackListFrench.add("coquin");
		return blackListFrench;
	}

	private static Set<String> getBlackListHindi() {
		Set<String> blackListHindi = new HashSet<String>();
		blackListHindi.add("दुष्ट");
		blackListHindi.add("कमीने");
		return blackListHindi;
	}

	private static Set<String> getBlackListEnglish() {
		Set<String> blackListEnglish = new HashSet<String>();
		blackListEnglish.add("ass");
		blackListEnglish.add("fuck");
		blackListEnglish.add("rascal");
		return blackListEnglish;
	}
	
	

}
