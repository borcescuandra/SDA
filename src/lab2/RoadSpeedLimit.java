package lab2;

//problema  1 - instructiuni conditionale
// implementare functie care primeste ca parametru un tip de drum
// returneaza viteza maxima admisa

public class RoadSpeedLimit {

    public static int getSpeedLimit_IfElse (String roadType){
        if (roadType == "Zona Rezidentiala") {
            return 30;
        } else if (roadType == "Oras") {
            return 50;
        } else if (roadType == "Drum express") {
            return 100;
        } else if (roadType == "Autostrada") {
            return 130;
        }

        return 0;
    }

    public static int getSpeedLimit_IfElseIf (String roadType){

        if (roadType == "Zona Rezidentiala") {
            return 30;

        } else {
            if (roadType == "Oras") {
                return 50;
            } else {
                if (roadType == "Drum express") {
                    return 100;
                } else {
                    if (roadType == "Autostrada") {
                        return 130;

                    }
                }
            }
        }

        return 0;
    }

    public static int getSpeedLimit_Switch (String roadType){

        switch (roadType) {

            case "Zona Rezidentiala":
                return 30;
            case "Oras":
                return 50;
            case "Drum express":
                return 100;
            case "Autostrada":
                return 130;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("Zona rezidentiala -> Viteza maxima admisa: " + getSpeedLimit_IfElse("Zona Rezidentiala"));
        System.out.println("Oras -> Viteza maxima admisa: " + getSpeedLimit_IfElse("Oras"));
        System.out.println("Drum express -> Viteza maxima admisa: " + getSpeedLimit_IfElse("Drum express"));
        System.out.println("Autostrada -> Viteza maxima admisa: " + getSpeedLimit_IfElse("Autostrada"));
        System.out.println("Necunoscut -> Viteza maxima admisa: " + getSpeedLimit_IfElse("Necunoscut"));
        System.out.println();

        System.out.println("Zona rezidentiala --> Viteza maxima admisa: " + getSpeedLimit_IfElseIf("Zona Rezidentiala"));
        System.out.println("Oras --> Viteza maxima admisa: " + getSpeedLimit_IfElseIf("Oras"));
        System.out.println("Drum express --> Viteza maxima admisa: " + getSpeedLimit_IfElseIf("Drum express"));
        System.out.println("Autostrada --> Viteza maxima admisa: " + getSpeedLimit_IfElseIf("Autostrada"));
        System.out.println("Necunoscut --> Viteza maxima admisa: " + getSpeedLimit_IfElseIf("Necunoscut"));
        System.out.println();

        System.out.println("Zona rezidentiala - Viteza maxima admisa:" + getSpeedLimit_Switch("Zona Rezidentiala"));
        System.out.println("Oras - Viteza maxima admisa: " + getSpeedLimit_Switch("Oras"));
        System.out.println("Drum express - Viteza maxima admisa: " + getSpeedLimit_Switch("Drum express"));
        System.out.println("Autostrada - Viteza maxima admisa: " + getSpeedLimit_Switch("Autostrada"));
        System.out.println("Necunoscut - Viteza maxima admisa: " + getSpeedLimit_Switch("Necunoscut"));

    } }