package model;

import java.util.ArrayList;

public class DataBase {
    public static final ArrayList<LoginData> database = new ArrayList<>();

    static {

        database.add(new LoginData(
            "samatha",
            "kerelli",
            "Name: samatha,\nProfession: student,\nEmail:samatha@gmail.com,\nOrganization: UCO"

        ));

        database.add(new LoginData(
            "Asha",
            "upperla",
            "Name: Asha,\nProfession:student,\nEmail: Asha@gmail.com,\nOrganization: UCO"

        ));

        database.add(new LoginData(
            "murali",
            "gamidi",
            "Name: Murali,\nProfession: student,\nEmail: murali@gmail.com,\nOrganization: UCO"
        ));

        database.add(new LoginData(
            "nikitha",
            "gaddam",
            "Name: nikitha,\nProfession: student,\nEmail: nikitha@gmail.com,\nOrganization: UCO"

        ));

        database.add(new LoginData(
            "gowtham",
            "gekkampalli",
            "Name: gowtham,\nProfession: student,\nEmail: gowtham@gmail.com,\nOrganization: UCO"

        ));

    }
}
