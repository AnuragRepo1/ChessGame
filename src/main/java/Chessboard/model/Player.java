package Chessboard.model;

import java.security.PrivateKey;

public class Player {
    private Person person;
    private String isWhiteSide;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getIsWhiteSide() {
        return isWhiteSide;
    }

    public void setIsWhiteSide(String isWhiteSide) {
        this.isWhiteSide = isWhiteSide;
    }
}
