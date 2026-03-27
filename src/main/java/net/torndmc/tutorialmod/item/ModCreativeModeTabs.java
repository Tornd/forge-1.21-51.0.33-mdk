package net.torndmc.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.torndmc.tutorialmod.TutorialMod;
import net.torndmc.tutorialmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
            .title(Component.translatable("creativetab.tutorial_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.ALEXANDRITE.get());
                pOutput.accept(ModItems.RAW_ALEXANDRITE.get());
                pOutput.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                pOutput.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
                pOutput.accept(Items.DIAMOND);
            })
            .build());

    public static void register(IEventBus eventbus) {
        CREATIVE_MODE_TABS.register(eventbus);
    }
}
