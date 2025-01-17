package org.launchcode.techjobs.oo;

public class PositionType extends JobField{

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        return value;
    }
    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.(Get help, if can't figure out).

    @Override
    public int hashCode() {
        return (id);
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared)
            return true;
        if (toBeCompared == null || getClass() != toBeCompared.getClass())
            return false;

        PositionType otherPositionType = (PositionType) toBeCompared;

        return id == otherPositionType.id;
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
