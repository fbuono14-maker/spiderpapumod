package com.heledron.spideranimation;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Entry point for the Forge 1.20.1 port of "arachnomod" (originally a
 * Paper/Spigot plugin: https://github.com/TheCymaera/minecraft-spider).
 *
 * IMPORTANT: This is a starting scaffold, not a full behavioral port.
 * Only the items are registered here (recipe-free: Creative tab / "/give"
 * only). The original mod's procedural spider animation, kinematic-chain
 * leg IK, custom entity rendering via display entities, and command system
 * are NOT reimplemented yet, because they rely on Paper/Bukkit APIs
 * (packet-based Display entities, Bukkit's scheduler and command API) that
 * have no 1:1 equivalent in Forge and need to be rebuilt using Forge's
 * entity, renderer, and event systems.
 */
@Mod(SpiderAnimationMod.MOD_ID)
public class SpiderAnimationMod {
    public static final String MOD_ID = "arachnomod";

    public SpiderAnimationMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        ModCreativeTab.CREATIVE_TABS.register(modEventBus);
    }
}
