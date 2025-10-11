public class ArrayReverse {

    public static void main(String[] args) {
        
        String[] animals = {"cat", "dog", "fish", "bird", "lizard"};
        
        // Reverse the array.
        for(int i = 0; i < animals.length / 2; i++) {
            String temp = animals[i];
            animals[i] = animals[animals.length - 1 - i];
            animals[animals.length - 1 - i] = temp;
        }

    }
    
}
