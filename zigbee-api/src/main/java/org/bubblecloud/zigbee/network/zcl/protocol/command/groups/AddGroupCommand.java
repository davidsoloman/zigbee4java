package org.bubblecloud.zigbee.network.zcl.protocol.command.groups;

import org.bubblecloud.zigbee.network.zcl.ZclCommandMessage;
import org.bubblecloud.zigbee.network.zcl.ZclUtil;
import org.bubblecloud.zigbee.network.zcl.ZclCommand;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclCommandType;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclFieldType;
import org.bubblecloud.zigbee.network.packet.ZToolAddress64;

/**
 * Code generated Add Group Command value object class.
 */
public class AddGroupCommand extends ZclCommand {
    /**
     * Group ID command message field.
     */
    private Integer groupId;
    /**
     * Group Name command message field.
     */
    private String groupName;

    /**
     * Default constructor setting the command type field.
     */
    public AddGroupCommand() {
        this.setType(ZclCommandType.ADD_GROUP_COMMAND);
    }

    /**
     * Constructor copying field values from command message.
     * @param message the command message
     */
    public AddGroupCommand(final ZclCommandMessage message) {
        super(message);
        this.groupId = (Integer) message.getFields().get(ZclFieldType.ADD_GROUP_COMMAND_GROUP_ID);
        this.groupName = (String) message.getFields().get(ZclFieldType.ADD_GROUP_COMMAND_GROUP_NAME);
    }

    @Override
    public ZclCommandMessage toCommandMessage() {
        final ZclCommandMessage message = super.toCommandMessage();
        message.getFields().put(ZclFieldType.ADD_GROUP_COMMAND_GROUP_ID,groupId);
        message.getFields().put(ZclFieldType.ADD_GROUP_COMMAND_GROUP_NAME,groupName);
        return message;
    }

    /**
     * Gets Group ID.
     * @return the Group ID
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * Sets Group ID.
     * @param groupId the Group ID
     */
    public void setGroupId(final Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * Gets Group Name.
     * @return the Group Name
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets Group Name.
     * @param groupName the Group Name
     */
    public void setGroupName(final String groupName) {
        this.groupName = groupName;
    }

}
