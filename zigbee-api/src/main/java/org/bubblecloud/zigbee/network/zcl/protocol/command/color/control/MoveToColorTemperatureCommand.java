package org.bubblecloud.zigbee.network.zcl.protocol.command.color.control;

import org.bubblecloud.zigbee.network.zcl.ZclCommandMessage;
import org.bubblecloud.zigbee.network.zcl.ZclUtil;
import org.bubblecloud.zigbee.network.zcl.ZclCommand;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclCommandType;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclFieldType;
import org.bubblecloud.zigbee.network.packet.ZToolAddress64;

/**
 * Code generated Move to Color Temperature Command value object class.
 */
public class MoveToColorTemperatureCommand extends ZclCommand {
    /**
     * Color Temperature command message field.
     */
    private Integer colorTemperature;
    /**
     * Transition time command message field.
     */
    private Integer transitionTime;

    /**
     * Default constructor setting the command type field.
     */
    public MoveToColorTemperatureCommand() {
        this.setType(ZclCommandType.MOVE_TO_COLOR_TEMPERATURE_COMMAND);
    }

    /**
     * Constructor copying field values from command message.
     * @param message the command message
     */
    public MoveToColorTemperatureCommand(final ZclCommandMessage message) {
        super(message);
        this.colorTemperature = (Integer) message.getFields().get(ZclFieldType.MOVE_TO_COLOR_TEMPERATURE_COMMAND_COLOR_TEMPERATURE);
        this.transitionTime = (Integer) message.getFields().get(ZclFieldType.MOVE_TO_COLOR_TEMPERATURE_COMMAND_TRANSITION_TIME);
    }

    @Override
    public ZclCommandMessage toCommandMessage() {
        final ZclCommandMessage message = super.toCommandMessage();
        message.getFields().put(ZclFieldType.MOVE_TO_COLOR_TEMPERATURE_COMMAND_COLOR_TEMPERATURE,colorTemperature);
        message.getFields().put(ZclFieldType.MOVE_TO_COLOR_TEMPERATURE_COMMAND_TRANSITION_TIME,transitionTime);
        return message;
    }

    /**
     * Gets Color Temperature.
     * @return the Color Temperature
     */
    public Integer getColorTemperature() {
        return colorTemperature;
    }

    /**
     * Sets Color Temperature.
     * @param colorTemperature the Color Temperature
     */
    public void setColorTemperature(final Integer colorTemperature) {
        this.colorTemperature = colorTemperature;
    }

    /**
     * Gets Transition time.
     * @return the Transition time
     */
    public Integer getTransitionTime() {
        return transitionTime;
    }

    /**
     * Sets Transition time.
     * @param transitionTime the Transition time
     */
    public void setTransitionTime(final Integer transitionTime) {
        this.transitionTime = transitionTime;
    }

}
