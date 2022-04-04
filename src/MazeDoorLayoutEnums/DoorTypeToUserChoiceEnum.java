package MazeDoorLayoutEnums;

import java.util.Arrays;

/**
 * +
 * it is an enum class for getting the door type objects depending on the user input and it will return the class object
 * as reduce if-else in the code
 * <p>
 * we can add as many doors as needed and there wont be any need of if-else in the main code
 */
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
