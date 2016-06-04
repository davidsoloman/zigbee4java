package org.bubblecloud.zigbee.network.zcl.protocol.command.ias.wd;

import org.bubblecloud.zigbee.network.zcl.ZclCommandMessage;
import org.bubblecloud.zigbee.network.zcl.ZclUtil;
import org.bubblecloud.zigbee.network.zcl.ZclCommand;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclCommandType;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclFieldType;
import org.bubblecloud.zigbee.network.packet.ZToolAddress64;

/**
 * Code generated Start Warning Command value object class.
 */
public class StartWarningCommand extends ZclCommand {
    /**
     * Header command message field.
     */
    private Integer header;
    /**
     * Warning duration command message field.
     */
    private Integer warningDuration;

    /**
     * Default constructor setting the command type field.
     */
    public StartWarningCommand() {
        this.setType(ZclCommandType.START_WARNING_COMMAND);
    }

    /**
     * Constructor copying field values from command message.
     * @param message the command message
     */
    public StartWarningCommand(final ZclCommandMessage message) {
        super(message);
        this.header = (Integer) message.getFields().get(ZclFieldType.START_WARNING_COMMAND_HEADER);
        this.warningDuration = (Integer) message.getFields().get(ZclFieldType.START_WARNING_COMMAND_WARNING_DURATION);
    }

    @Override
    public ZclCommandMessage toCommandMessage() {
        final ZclCommandMessage message = super.toCommandMessage();
        message.getFields().put(ZclFieldType.START_WARNING_COMMAND_HEADER,header);
        message.getFields().put(ZclFieldType.START_WARNING_COMMAND_WARNING_DURATION,warningDuration);
        return message;
    }

    /**
     * Gets Header.
     * @return the Header
     */
    public Integer getHeader() {
        return header;
    }

    /**
     * Sets Header.
     * @param header the Header
     */
    public void setHeader(final Integer header) {
        this.header = header;
    }

    /**
     * Gets Warning duration.
     * @return the Warning duration
     */
    public Integer getWarningDuration() {
        return warningDuration;
    }

    /**
     * Sets Warning duration.
     * @param warningDuration the Warning duration
     */
    public void setWarningDuration(final Integer warningDuration) {
        this.warningDuration = warningDuration;
    }

}
