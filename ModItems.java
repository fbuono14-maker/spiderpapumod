package com.heledron.spideranimation;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * All items from the original mod are registered here as plain Items with
 * NO crafting recipe registered anywhere in this project (there is no
 * data/arachnomod/recipe/ folder). That means the only ways to obtain them
 * in-game are:
 *   - The Creative inventory (they appear under the "Arachnomod" tab)
 *   - /give <player> arachnomod:spider_tamer
 *   - /give <player> arachnomod:spider_spawn_egg
 *
 * NOTE: "spider_spawn_egg" is registered as a plain Item (icon + name only)
 * rather than a functional SpawnEggItem, because the original custom
 * "spider" entity (its AI, model and procedural-animation renderer) is not
 * ported in this scaffold yet. Wire it up to a real EntityType once the
 * entity itself has been ported.
 */
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpiderAnimationMod.MOD_ID);

    public static final RegistryObject<Item> SPIDER_TAMER = ITEMS.register("spider_tamer",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPIDER_SPAWN_EGG = ITEMS.register("spider_spawn_egg",
            () -> new Item(new Item.Properties()));
}
