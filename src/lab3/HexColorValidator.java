package lab3;

public class HexColorValidator {
    Boolean validate(String colorHex) {

        Boolean ok = true;

        if (colorHex.charAt(0) != '#') {
            ok = false;
            throw new IllegalArgumentException("Codului Hex nu ii este asociata nici o valoare!");

        }

        if (colorHex.length() > 7) {
            ok = false;
            throw new IllegalArgumentException(
                    "Codul Hex este format din 7 caractere!");

        }

        int i = 1;
        while (i < 7)

        {
            if (colorHex.charAt(i) < 'a' && colorHex.charAt(i) < '0'
                    || colorHex.charAt(i) > 'f' && colorHex.charAt(i) > '9') {
                ok = false;
                throw new IllegalArgumentException(
                        "TCodul Hex contine doar caractere intre A si F!");
            }

            i++;

        }

        return ok;

    }
}
