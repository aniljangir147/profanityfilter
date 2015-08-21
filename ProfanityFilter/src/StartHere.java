
public class StartHere {

	public static void main(String[] args) {
		String sanitizedString = ProfanityFilter.sanitize(LanguageType.ENGLISH, "fuck you man");
		String sanitizedString2 = ProfanityFilter.sanitize(LanguageType.HINDI, "दुष्ट आदमी");
		String sanitizedString3 = ProfanityFilter.sanitize(LanguageType.FRENCH, "vous coquin");
		String sanitizedString4 = ProfanityFilter.sanitize(LanguageType.SPANISH, "ustedes bribón");
		String sanitizedString5 = ProfanityFilter.sanitize(LanguageType.ARABIC, "أنت الوغد");
		String sanitizedString6 = ProfanityFilter.sanitize(LanguageType.GERMAN, "Sie Schlingel");
		String sanitizedString7 = ProfanityFilter.sanitize(LanguageType.JAPANESE, "あなた 野郎");
		String sanitizedString8 = ProfanityFilter.sanitize(LanguageType.ITALIAN, "voi mascalzone");
		String sanitizedString9 = ProfanityFilter.sanitize(LanguageType.RUSSIAN, "вы негодяй");
		String sanitizedString10 = ProfanityFilter.sanitize(LanguageType.CHINESE, "你 坏蛋");
		System.out.println("Sanitized string ENGLISH is : "+sanitizedString);
		System.out.println("Sanitized string HINDI is : "+sanitizedString2);
		System.out.println("Sanitized string FRENCH is : "+sanitizedString3);
		System.out.println("Sanitized string SPANISH is : "+sanitizedString4);
		System.out.println("Sanitized string ARABIC is : "+sanitizedString5);
		System.out.println("Sanitized string GERMAN is : "+sanitizedString6);
		System.out.println("Sanitized string JAPANESE is : "+sanitizedString7);
		System.out.println("Sanitized string ITALIAN is : "+sanitizedString8);
		System.out.println("Sanitized string RUSSIAN is : "+sanitizedString9);
		System.out.println("Sanitized string CHINESE is : "+sanitizedString10);

	}

}
