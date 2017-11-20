package saver.game;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class GameCharacter implements Serializable{
    int power;
    String type;
    String[] weapons;

    public GameCharacter(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String[] getWeapons() {
        return weapons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameCharacter)) return false;
        GameCharacter that = (GameCharacter) o;
        return getPower() == that.getPower() &&
            Objects.equals(getType(), that.getType()) &&
            Arrays.equals(getWeapons(), that.getWeapons());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPower(), getType(), getWeapons());
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
            "power=" + power +
            ", type='" + type + '\'' +
            ", weapons=" + Arrays.toString(weapons) +
            '}';
    }
}
