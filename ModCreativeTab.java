package com.heledron.spideranimation;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(ForgeRegistries.CREATIVE_MODE_TABS, SpiderAnimationMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ARACHNOMOD_TAB = CREATIVE_TABS.register("arachnomod_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.arachnomod"))
                    .icon(() -> new ItemStack(ModItems.SPIDER_TAMER.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.SPIDER_TAMER.get());
                        output.accept(ModItems.SPIDER_SPAWN_EGG.get());
                    })
                    .build());
}
