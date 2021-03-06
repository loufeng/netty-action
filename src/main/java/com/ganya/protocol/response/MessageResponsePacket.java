package com.ganya.protocol.response;

import com.ganya.protocol.Packet;
import com.ganya.protocol.command.Command;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author loufeng
 * @date 2018/10/17 2:43 PM
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MessageResponsePacket extends Packet {
    private String msg;

    @Override
    public Byte getCommand() {
        return Command.MESSAGE_RESPONSE;
    }
}
