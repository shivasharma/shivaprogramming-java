package var;


public class Varexample {

    void main() {

        byte x = 100;
        var y = 100L;
        var z = 199.0;
        var a = 199.0f;
        var b = (byte) 199;
        var c = (short) 199;
        System.out.println(((Object) y).getClass().getName());
    }
}
