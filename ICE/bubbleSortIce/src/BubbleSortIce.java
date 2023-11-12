
import java.util.Arrays;

public class BubbleSortIce {

    public static void main(String[] args) {
        //copied from vclearn
        String[] words = {
            "corpulent", "skulduggery", "impavid", "limerence", "licentiousness", "luddite",
            "mellifluous", "petrichor", "serendipity", "sonder", "ephemeral", "ineffable",
            "solitude", "aurora", "cosmos", "idyllic", "halcyon", "luminescence", "ethereal",
            "wanderlust", "nemesis", "quintessential", "surreptitious", "flabbergasted",
            "discombobulate", "antidisestablishmentarianism", "floccinaucinihilipilification",
            "pneumonoultramicroscopicsilicovolcanoconiosis", "sesquipedalian", "defenestration",
            "collywobbles", "gobbledygook", "ragamuffin", "whippersnapper", "poppycock",
            "onomatopoeia", "cacophony", "euphony", "rhapsody", "zenith", "nadir", "apex", "abyss",
            "paradox", "oxymoron", "juxtaposition", "anomaly", "phenomenon", "epiphany",
            "revelation", "catharsis", "serenity", "bliss", "euphoria", "ecstasy", "elation",
            "exuberance", "vivacious", "radiant", "luminous", "resplendent", "magnificent",
            "splendid", "glorious", "sublime", "transcendental", "enigmatic", "mysterious",
            "cryptic", "esoteric", "obscure", "ambiguous", "equivocal", "perplexing", "baffling",
            "bewildering", "dazzling", "scintillating", "sparkling", "incandescent", "iridescent",
            "prismatic", "kaleidoscopic", "chromatic"
        };

        String[] wordsBubble = Arrays.copyOf(words, words.length);
        String[] wordsInsertion = Arrays.copyOf(words, words.length);

        System.out.println("Bubble Sort:");
        sortAndDisplayInfo(wordsBubble, "bubble");

        System.out.println("\nInsertion Sort:");
        sortAndDisplayInfo(wordsInsertion, "insertion");
    }

    public static void sortAndDisplayInfo(String[] arr, String algorithm) {
        int comparisons, swaps;
        long startTime, endTime;
        double duration;

        if (algorithm.equals("bubble")) {
            startTime = System.nanoTime();
            comparisons = bubbleSort(arr);
            endTime = System.nanoTime();
        } else {
            startTime = System.nanoTime();
            comparisons = insertionSort(arr);
            endTime = System.nanoTime();
        }
           
        //copied from vclearn
        duration = (endTime - startTime) / 1000000000.0;
        swaps = comparisons - arr.length;
        
        //printing out the necessary information and results for time taken 
       System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
        System.out.println("Time taken: " + duration + " seconds");
    }

    public static int bubbleSort(String[] arr) {
        int n = arr.length;
        int comparisons = 0;
        //sorting
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return comparisons;
    }

    public static int insertionSort(String[] arr) {
        int n = arr.length;
        int comparisons = 0;

        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            //sorting
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                comparisons++;
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        return comparisons;
    }
}
