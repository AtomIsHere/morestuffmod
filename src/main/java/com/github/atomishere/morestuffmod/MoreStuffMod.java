package com.github.atomishere.morestuffmod;

import com.github.atomishere.morestuffmod.block.MoreBlocks;
import net.fabricmc.api.ModInitializer;

public class MoreStuffMod implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("Starting more stuff");

        MoreBlocks.register();
    }
}
