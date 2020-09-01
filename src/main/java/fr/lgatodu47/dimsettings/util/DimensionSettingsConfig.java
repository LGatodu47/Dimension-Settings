package fr.lgatodu47.dimsettings.util;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import me.sargunvohra.mcmods.autoconfig1u.serializer.PartitioningSerializer;
import net.minecraft.client.options.AoMode;
import net.minecraft.client.options.GraphicsMode;
import net.minecraft.client.options.ParticlesMode;

@SuppressWarnings("unused")
@Config(name = "dimsettings")
@Config.Gui.Background("minecraft:textures/block/stone.png")
@Config.Gui.CategoryBackground(category = "overworld", background = "minecraft:textures/block/dirt.png")
@Config.Gui.CategoryBackground(category = "nether", background = "minecraft:textures/block/netherrack.png")
@Config.Gui.CategoryBackground(category = "end", background = "minecraft:textures/block/end_stone.png")
public class DimensionSettingsConfig extends PartitioningSerializer.GlobalData
{
    @ConfigEntry.Category("general")
    @ConfigEntry.Gui.TransitiveObject
    public ModuleGeneral moduleGeneral = new ModuleGeneral();

    @ConfigEntry.Category("overworld")
    @ConfigEntry.Gui.TransitiveObject
    public ModuleOverworld moduleOverworld = new ModuleOverworld();

    @ConfigEntry.Category("nether")
    @ConfigEntry.Gui.TransitiveObject
    public ModuleNether moduleNether = new ModuleNether();

    @ConfigEntry.Category("end")
    @ConfigEntry.Gui.TransitiveObject
    public ModuleEnd moduleEnd = new ModuleEnd();

    @Config(name = "module_general")
    public static class ModuleGeneral implements ConfigData
    {
        @ConfigEntry.Gui.Tooltip
        public boolean enableDimensionSettings = false;
    }

    @Config(name = "module_overworld")
    public static class ModuleOverworld implements ConfigData
    {
        @ConfigEntry.BoundedDiscrete(min = 2, max = 32)
        public int renderDistance = 8;

        @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
        public int brightness = 0;

        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
        public ParticlesMode particles = ParticlesMode.ALL;

        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
        public GraphicsMode graphics = GraphicsMode.FANCY;

        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
        public AoMode smoothLightning = AoMode.MAX;

        @ConfigEntry.BoundedDiscrete(min = 50, max = 500)
        public int entityDistance = 100;

        public boolean enableEntityShadows = true;
    }

    @Config(name = "module_nether")
    public static class ModuleNether implements ConfigData
    {
        @ConfigEntry.BoundedDiscrete(min = 2, max = 32)
        public int renderDistance = 8;

        @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
        public int brightness = 0;

        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
        public ParticlesMode particles = ParticlesMode.ALL;

        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
        public GraphicsMode graphics = GraphicsMode.FANCY;

        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
        public AoMode smoothLightning = AoMode.MAX;

        @ConfigEntry.BoundedDiscrete(min = 50, max = 500)
        public int entityDistance = 100;

        public boolean enableEntityShadows = true;
    }

    @Config(name = "module_end")
    public static class ModuleEnd implements ConfigData
    {
        @ConfigEntry.BoundedDiscrete(min = 2, max = 32)
        public int renderDistance = 8;

        @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
        public int brightness = 0;

        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
        public ParticlesMode particles = ParticlesMode.ALL;

        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
        public GraphicsMode graphics = GraphicsMode.FANCY;

        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
        public AoMode smoothLightning = AoMode.MAX;

        @ConfigEntry.BoundedDiscrete(min = 50, max = 500)
        public int entityDistance = 100;

        public boolean enableEntityShadows = true;
    }
}
