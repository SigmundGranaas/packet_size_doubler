package com.sigmundgranaas.packetsizedoubler.mixin;

import net.minecraft.network.PacketEncoder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(PacketEncoder.class)
public class PacketEncoderMixin {
    @ModifyConstant(method = "encode(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/Packet;Lio/netty/buffer/ByteBuf;)V", constant = @Constant(intValue = 8388608))
    private int injected(int value) {
        return value * 2;
    }
}
