public class Runner
{
    public static void main(String[] args)
    {
        String[] test1 = {"Kye", "is", "very", "beautiful"};
        WordPairList test1List = new WordPairList(test1);
        System.out.println(test1List);
        System.out.println("Matches: " + test1List.numMatches());

        String[] test2 = {"the", "more", "the", "merrier"};
        WordPairList test2List = new WordPairList(test2);
        System.out.println(test2List);
        System.out.println("Matches: " + test2List.numMatches());

        String[] test3 = {"Hey", "You", "Hey", "Listen", "Hey"};
        WordPairList test3List = new WordPairList(test3);
        System.out.println(test3List);
        System.out.println("Matches: " + test3List.numMatches());
    }
}
