public class StringUtils {

    public static boolean included(String word, String searched){

        if(word != null || searched != null){

            String adjustedSearch = searched.trim().toUpperCase();
            String adjustedWord = word.toUpperCase();

            if (adjustedWord.contains(adjustedSearch)) {
                return true;
            }
        }
        return false;
    }
}
