/**
 * Class work at String
 */

public class App {
    private String str = "Hello World!";

    /**
     * get field str
     * @return field str
     */
    public String getStr() {
        return this.str;
    }

    /**
     * concatenation operation
     * @param newStr new string for add to field str
     */
    public void addStr(String newStr) {
        this.str += newStr;
    }
}
