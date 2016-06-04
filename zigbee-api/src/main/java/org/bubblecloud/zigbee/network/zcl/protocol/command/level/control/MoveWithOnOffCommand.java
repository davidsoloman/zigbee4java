package org.bubblecloud.zigbee.network.zcl.protocol.command.level.control;

import org.bubblecloud.zigbee.network.zcl.ZclCommandMessage;
import org.bubblecloud.zigbee.network.zcl.ZclUtil;
import org.bubblecloud.zigbee.network.zcl.ZclCommand;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclCommandType;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclFieldType;
import org.bubblecloud.zigbee.network.packet.ZToolAddress64;

/**
 * Code generated Move (with On/Off) Command value object class.
 */
public class MoveWithOnOffCommand extends ZclCommand {
    /**
     * Move mode command message field.
     */
    private Integer moveMode;
    /**
     * Rate command message field.
     */
    private Integer rate;

    /**
     * Default constructor setting the command type field.
     */
    public MoveWithOnOffCommand() {
        this.setType(ZclCommandType.MOVE__WITH_ON_OFF__COMMAND);
    }

    /**
     * Constructor copying field values from command message.
     * @param message the command message
     */
    public MoveWithOnOffCommand(final ZclCommandMessage message) {
        super(message);
        this.moveMode = (Integer) message.getFields().get(ZclFieldType.MOVE__WITH_ON_OFF__COMMAND_MOVE_MODE);
        this.rate = (Integer) message.getFields().get(ZclFieldType.MOVE__WITH_ON_OFF__COMMAND_RATE);
    }

    @Override
    public ZclCommandMessage toCommandMessage() {
        final ZclCommandMessage message = super.toCommandMessage();
        message.getFields().put(ZclFieldType.MOVE__WITH_ON_OFF__COMMAND_MOVE_MODE,moveMode);
        message.getFields().put(ZclFieldType.MOVE__WITH_ON_OFF__COMMAND_RATE,rate);
        return message;
    }

    /**
     * Gets Move mode.
     * @return the Move mode
     */
    public Integer getMoveMode() {
        return moveMode;
    }

    /**
     * Sets Move mode.
     * @param moveMode the Move mode
     */
    public void setMoveMode(final Integer moveMode) {
        this.moveMode = moveMode;
    }

    /**
     * Gets Rate.
     * @return the Rate
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * Sets Rate.
     * @param rate the Rate
     */
    public void setRate(final Integer rate) {
        this.rate = rate;
    }

}
