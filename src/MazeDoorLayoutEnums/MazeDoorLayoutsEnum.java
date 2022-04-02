package MazeDoorLayoutEnums;

public enum MazeDoorLayoutsEnum {
    DoorsAll4Directions("NORTH", "SOUTH", "EAST", "WEST"),
    DoorsOddRowEvenRoom(null, null, "WEST", "EAST"),
    DoorsEvenRowOddRoom("NORTH", "SOUTH", null, null);

    private String north;
    private String south;
    private String east;
    private String west;

    MazeDoorLayoutsEnum(final String north, final String south, final String east, final String west) {
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }
}
