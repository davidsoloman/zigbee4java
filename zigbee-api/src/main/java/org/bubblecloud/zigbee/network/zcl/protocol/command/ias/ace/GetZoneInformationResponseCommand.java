package org.bubblecloud.zigbee.network.zcl.protocol.command.ias.ace;

import org.bubblecloud.zigbee.network.zcl.ZclCommandMessage;
import org.bubblecloud.zigbee.network.zcl.ZclUtil;
import org.bubblecloud.zigbee.network.zcl.ZclCommand;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclCommandType;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclFieldType;
import org.bubblecloud.zigbee.network.packet.ZToolAddress64;

/**
 * Code generated Get Zone Information Response Command value object class.
 */
public class GetZoneInformationResponseCommand extends ZclCommand {
    /**
     * Zone ID command message field.
     */
    private Integer zoneId;
    /**
     * Zone Type command message field.
     */
    private Integer zoneType;
    /**
     * IEEE address command message field.
     */
    private ZToolAddress64 ieeeAddress;

    /**
     * Default constructor setting the command type field.
     */
    public GetZoneInformationResponseCommand() {
        this.setType(ZclCommandType.GET_ZONE_INFORMATION_RESPONSE_COMMAND);
    }

    /**
     * Constructor copying field values from command message.
     * @param message the command message
     */
    public GetZoneInformationResponseCommand(final ZclCommandMessage message) {
        super(message);
        this.zoneId = (Integer) message.getFields().get(ZclFieldType.GET_ZONE_INFORMATION_RESPONSE_COMMAND_ZONE_ID);
        this.zoneType = (Integer) message.getFields().get(ZclFieldType.GET_ZONE_INFORMATION_RESPONSE_COMMAND_ZONE_TYPE);
        this.ieeeAddress = (ZToolAddress64) message.getFields().get(ZclFieldType.GET_ZONE_INFORMATION_RESPONSE_COMMAND_IEEE_ADDRESS);
    }

    @Override
    public ZclCommandMessage toCommandMessage() {
        final ZclCommandMessage message = super.toCommandMessage();
        message.getFields().put(ZclFieldType.GET_ZONE_INFORMATION_RESPONSE_COMMAND_ZONE_ID,zoneId);
        message.getFields().put(ZclFieldType.GET_ZONE_INFORMATION_RESPONSE_COMMAND_ZONE_TYPE,zoneType);
        message.getFields().put(ZclFieldType.GET_ZONE_INFORMATION_RESPONSE_COMMAND_IEEE_ADDRESS,ieeeAddress);
        return message;
    }

    /**
     * Gets Zone ID.
     * @return the Zone ID
     */
    public Integer getZoneId() {
        return zoneId;
    }

    /**
     * Sets Zone ID.
     * @param zoneId the Zone ID
     */
    public void setZoneId(final Integer zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * Gets Zone Type.
     * @return the Zone Type
     */
    public Integer getZoneType() {
        return zoneType;
    }

    /**
     * Sets Zone Type.
     * @param zoneType the Zone Type
     */
    public void setZoneType(final Integer zoneType) {
        this.zoneType = zoneType;
    }

    /**
     * Gets IEEE address.
     * @return the IEEE address
     */
    public ZToolAddress64 getIeeeAddress() {
        return ieeeAddress;
    }

    /**
     * Sets IEEE address.
     * @param ieeeAddress the IEEE address
     */
    public void setIeeeAddress(final ZToolAddress64 ieeeAddress) {
        this.ieeeAddress = ieeeAddress;
    }

}
