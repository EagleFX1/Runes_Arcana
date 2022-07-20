package com.eaglefx1.runes_arcana.item;

import com.eaglefx1.runes_arcana.Runes_Arcana;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, Runes_Arcana.MOD_ID);

    public static final RegistryObject<Item> RUNE = ITEMS.register("blank_rune",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_FIRE = ITEMS.register("rune_of_fire",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}