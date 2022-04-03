package MazeDoorLayoutEnums;

import java.util.Arrays;

public enum DoorTypeToUserChoiceEnum {
    BombDoor(1, "BombDoor"),
    GlassDoor(2, "GlassDoor"),
    EnchantedDoor(3, "EnchantedDoor");

    private int interfaceSequenceNumber;
    private String doorInterfaceName;


    DoorTypeToUserChoiceEnum(int interfaceSequenceNumber, String doorInterfaceName) {

        this.interfaceSequenceNumber = interfaceSequenceNumber;
        this.doorInterfaceName = doorInterfaceName;
    }

    public static String getDoorInterfaceNameFromSeqChoice(int seqChoice) {
        return Arrays.stream(DoorTypeToUserChoiceEnum.values()).
                filter(doorTypeMap -> doorTypeMap.interfaceSequenceNumber == seqChoice)
                .findFirst().get().doorInterfaceName;
    }

}
