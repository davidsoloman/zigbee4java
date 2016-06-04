package org.bubblecloud.zigbee.network.zcl.protocol.command.commissioning;

import org.bubblecloud.zigbee.network.zcl.ZclCommandMessage;
import org.bubblecloud.zigbee.network.zcl.ZclUtil;
import org.bubblecloud.zigbee.network.zcl.ZclCommand;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclCommandType;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclFieldType;
import org.bubblecloud.zigbee.network.packet.ZToolAddress64;

/**
 * Code generated Restart Device Command value object class.
 */
public class RestartDeviceCommand extends ZclCommand {
    /**
     * Option command message field.
     */
    private Integer option;
    /**
     * Delay command message field.
     */
    private Integer delay;
    /**
     * Jitter command message field.
     */
    private Integer jitter;

    /**
     * Default constructor setting the command type field.
     */
    public RestartDeviceCommand() {
        this.setType(ZclCommandType.RESTART_DEVICE_COMMAND);
    }

    /**
     * Constructor copying field values from command message.
     * @param message the command message
     */
    public RestartDeviceCommand(final ZclCommandMessage message) {
        super(message);
        this.option = (Integer) message.getFields().get(ZclFieldType.RESTART_DEVICE_COMMAND_OPTION);
        this.delay = (Integer) message.getFields().get(ZclFieldType.RESTART_DEVICE_COMMAND_DELAY);
        this.jitter = (Integer) message.getFields().get(ZclFieldType.RESTART_DEVICE_COMMAND_JITTER);
    }

    @Override
    public ZclCommandMessage toCommandMessage() {
        final ZclCommandMessage message = super.toCommandMessage();
        message.getFields().put(ZclFieldType.RESTART_DEVICE_COMMAND_OPTION,option);
        message.getFields().put(ZclFieldType.RESTART_DEVICE_COMMAND_DELAY,delay);
        message.getFields().put(ZclFieldType.RESTART_DEVICE_COMMAND_JITTER,jitter);
        return message;
    }

    /**
     * Gets Option.
     * @return the Option
     */
    public Integer getOption() {
        return option;
    }

    /**
     * Sets Option.
     * @param option the Option
     */
    public void setOption(final Integer option) {
        this.option = option;
    }

    /**
     * Gets Delay.
     * @return the Delay
     */
    public Integer getDelay() {
        return delay;
    }

    /**
     * Sets Delay.
     * @param delay the Delay
     */
    public void setDelay(final Integer delay) {
        this.delay = delay;
    }

    /**
     * Gets Jitter.
     * @return the Jitter
     */
    public Integer getJitter() {
        return jitter;
    }

    /**
     * Sets Jitter.
     * @param jitter the Jitter
     */
    public void setJitter(final Integer jitter) {
        this.jitter = jitter;
    }

}
