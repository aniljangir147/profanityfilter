import java.util.HashSet;
import java.util.Set;


public class ProfanityChecker {
	
	public static String check(final LanguageType langType,final String str) {
		Set<String> blackList = getBlackListData(langType);
		String[] words = str.split(" ");
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

	private static Set<String> getBlackListData(LanguageType langType) {
		Set<String> blackList = null;
		
		Set<String> blackListEnglish = new HashSet<String>();
		blackListEnglish.add("ass");
		blackListEnglish.add("fuck");
		blackListEnglish.add("rascal");
		
		Set<String> blackListHindi = new HashSet<String>();
		blackListHindi.add("दुष्ट");
		blackListHindi.add("कमीने");
		
		Set<String> blackListFrench = new HashSet<String>();
		blackListFrench.add("coquin");
		Set<String> blackListSpanish = new HashSet<String>();
		blackListSpanish.add("bribón");
		Set<String> blackListArabic = new HashSet<String>();
		blackListArabic.add("الوغد");
		Set<String> blackListGerman = new HashSet<String>();
		blackListGerman.add("schlingel");
		Set<String> blackListJapanese = new HashSet<String>();
		blackListJapanese.add("野郎");
		Set<String> blackListItalian = new HashSet<String>();
		blackListItalian.add("mascalzone");
		Set<String> blackListRussian = new HashSet<String>();
		blackListRussian.add("негодяй");
		Set<String> blackListChinese = new HashSet<String>();
		blackListChinese.add("坏蛋");
		
		switch (langType) {
        case ENGLISH: 
        	blackList = blackListEnglish;
            break;
        case HINDI: 
        	blackList = blackListHindi;
            break;
        case FRENCH: 
        	blackList = blackListFrench;
            break;
        case SPANISH: 
        	blackList = blackListSpanish;
            break;
        case ARABIC: 
        	blackList = blackListArabic;
            break;
        case GERMAN: 
        	blackList = blackListGerman;
            break;
        case JAPANESE: 
        	blackList = blackListJapanese;
            break;
        case ITALIAN: 
        	blackList = blackListItalian;
            break;
        case RUSSIAN: 
        	blackList = blackListRussian;
            break;
        case CHINESE: 
        	blackList = blackListChinese;
            break;
        default: 
        	blackList = blackListEnglish;
            break;
    }
		return blackList;
	}

}
