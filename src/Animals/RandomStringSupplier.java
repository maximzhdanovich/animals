package Animals;

import java.util.Random;

public class RandomStringSupplier implements StringSupplier {

    @Override
    public String getString() {
        final String characters = "ABCDEFGHJKLMNOPQRSTUVWXYZ";
        int length = new Random().nextInt(10) + 1;
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(new Random().nextInt(characters.length()));
        }
        return new String(text);
    }
}
