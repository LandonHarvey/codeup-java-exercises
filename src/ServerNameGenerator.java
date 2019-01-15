public class ServerNameGenerator {
    static String[] adjectives = {"aggressive","agreeable","ambitious","brave","calm","delightful","eager","faithful","plump","scruffy"};
    static String[] nouns = {"people","history","way","art","world","information","map","family","government","health"};

    public static String randomElement(String[] array){
       int ran = (int) (Math.floor(Math.random() * array.length));
       return array[ran];
    }

    public static void main(String[] args) {
        String noun = randomElement(nouns);
        String adj = randomElement(adjectives);
        System.out.println(noun + "-" + adj);
    }

}
