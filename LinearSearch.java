public class LinearSearch {
    public static boolean searchInArray(int numberOfElements, int searchElement, int []array) {
        boolean isPresent = false;

        for(int num : array) {
            if(num == searchElement) {
                isPresent = true;
                break;
            }
        }

        return isPresent;
    }
}