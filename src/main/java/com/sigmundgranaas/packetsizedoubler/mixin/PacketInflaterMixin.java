package com.sigmundgranaas.packetsizedoubler.mixin;

import net.minecraft.network.PacketInflater;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(PacketInflater.class)
public class PacketInflaterMixin {

    @ModifyConstant(method = "decode", constant = @Constant(intValue = 8388608))
    private int injected(int value) {
        return value * 2;
    }
}
