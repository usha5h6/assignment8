public class Remove2 {

	/**
	 * @param args
	 */

		public String remove(String string){
			char firstChar = string.charAt(0);
			char secondChar = string.charAt(1);
			String s = "";
			if (firstChar == 'A' && secondChar == 'A'){
				s = s + string.substring(2);
			}
			else if (secondChar == 'A'){
				s = firstChar + string.substring(2);
			}
			else if (firstChar == 'A'){
				s = s + string.substring(1);
			}
			else{
				s = s + string;
			}
			return s;
		}


}