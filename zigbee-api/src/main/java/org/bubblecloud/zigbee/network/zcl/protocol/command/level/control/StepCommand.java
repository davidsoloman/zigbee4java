package org.bubblecloud.zigbee.network.zcl.protocol.command.level.control;

import org.bubblecloud.zigbee.network.zcl.ZclCommandMessage;
import org.bubblecloud.zigbee.network.zcl.ZclUtil;
import org.bubblecloud.zigbee.network.zcl.ZclCommand;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclCommandType;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclFieldType;
import org.bubblecloud.zigbee.network.packet.ZToolAddress64;

/**
 * Code generated Step Command value object class.
 */
public class StepCommand extends ZclCommand {
    /**
     * Step mode command message field.
     */
    private Integer stepMode;
    /**
     * Step size command message field.
     */
    private Integer stepSize;
    /**
     * Transition time command message field.
     */
    private Integer transitionTime;

    /**
     * Default constructor setting the command type field.
     */
    public StepCommand() {
        this.setType(ZclCommandType.STEP_COMMAND);
    }

    /**
     * Constructor copying field values from command message.
     * @param message the command message
     */
    public StepCommand(final ZclCommandMessage message) {
        super(message);
        this.stepMode = (Integer) message.getFields().get(ZclFieldType.STEP_COMMAND_STEP_MODE);
        this.stepSize = (Integer) message.getFields().get(ZclFieldType.STEP_COMMAND_STEP_SIZE);
        this.transitionTime = (Integer) message.getFields().get(ZclFieldType.STEP_COMMAND_TRANSITION_TIME);
    }

    @Override
    public ZclCommandMessage toCommandMessage() {
        final ZclCommandMessage message = super.toCommandMessage();
        message.getFields().put(ZclFieldType.STEP_COMMAND_STEP_MODE,stepMode);
        message.getFields().put(ZclFieldType.STEP_COMMAND_STEP_SIZE,stepSize);
        message.getFields().put(ZclFieldType.STEP_COMMAND_TRANSITION_TIME,transitionTime);
        return message;
    }

    /**
     * Gets Step mode.
     * @return the Step mode
     */
    public Integer getStepMode() {
        return stepMode;
    }

    /**
     * Sets Step mode.
     * @param stepMode the Step mode
     */
    public void setStepMode(final Integer stepMode) {
        this.stepMode = stepMode;
    }

    /**
     * Gets Step size.
     * @return the Step size
     */
    public Integer getStepSize() {
        return stepSize;
    }

    /**
     * Sets Step size.
     * @param stepSize the Step size
     */
    public void setStepSize(final Integer stepSize) {
        this.stepSize = stepSize;
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
