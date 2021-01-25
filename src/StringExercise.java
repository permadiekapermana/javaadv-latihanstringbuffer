public class StringExercise {
    public static StringBuffer createStringBuffer() {
        StringBuffer strBuff = new StringBuffer("i’m in java practice");
        return strBuff;
    }

    public static void main(String[] args) {
        StringBuffer strBuff = createStringBuffer();
        // cetak nilai strBuff
        System.out.println(strBuff);
        // insert string to string buffer, start from index 0
        strBuff.insert(0,"Hai, ");
        System.out.println(strBuff);
        // upper case        
        System.out.println(strBuff.toString().toUpperCase() + "\n");
        // lower case
        System.out.println(strBuff.toString().toLowerCase());
        // reverse
        System.out.println(strBuff.reverse());
    }
}