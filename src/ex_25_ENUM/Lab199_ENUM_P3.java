package ex_25_ENUM;

public class Lab199_ENUM_P3 {
    public static void main(String[] args) {
        System.out.println(HEX_COLORS.RED.getHexcode());
    }
}

//KEY VALUE PAIRS
enum HEX_COLORS{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    //IF WE ARE USING KEY VALUE PAIR WE NEED TO CREATE CONSTRUCTOR AS WELL AS GETTER

    private String hexcode;
    HEX_COLORS(String hexcode)
    {
        this.hexcode=hexcode;
    }

    String getHexcode()
    {
        return this.hexcode;
    }
}