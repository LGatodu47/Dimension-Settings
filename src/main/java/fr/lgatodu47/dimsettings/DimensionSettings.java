package fr.lgatodu47.dimsettings;

import fr.lgatodu47.dimsettings.util.DimensionSettingsConfig;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DimensionSettings implements ClientModInitializer
{
	public static Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "dimsettings";

	@Override
	public void onInitializeClient()
	{
		LOGGER.info("Dimension Settings loaded!");
		//AutoConfig.register(DimensionSettingsConfig.class, GsonConfigSerializer::new);
		AutoConfig.getGuiRegistry(DimensionSettingsConfig.class);
		this.worldTick();
	}

	private void worldTick()
	{
		ClientTickEvents.START_WORLD_TICK.register((clientWorld -> {
			DimensionSettingsConfig config = AutoConfig.getConfigHolder(DimensionSettingsConfig.class).getConfig();
			if(config.moduleGeneral.enableDimensionSettings)
			{
				if(clientWorld.getDimension().isBedWorking())
				{
					if(MinecraftClient.getInstance().options.viewDistance != config.moduleOverworld.renderDistance)
					{
						MinecraftClient.getInstance().options.viewDistance = config.moduleOverworld.renderDistance;
					}
					if(MinecraftClient.getInstance().options.gamma != ((float)config.moduleOverworld.brightness) / 100)
					{
						MinecraftClient.getInstance().options.gamma = ((float)config.moduleOverworld.brightness) / 100;
					}
					if(MinecraftClient.getInstance().options.particles != config.moduleOverworld.particles)
					{
						MinecraftClient.getInstance().options.particles = config.moduleOverworld.particles;
					}
					if(MinecraftClient.getInstance().options.graphicsMode != config.moduleOverworld.graphics)
					{
						MinecraftClient.getInstance().options.graphicsMode = config.moduleOverworld.graphics;
					}
					if(MinecraftClient.getInstance().options.ao != config.moduleOverworld.smoothLightning)
					{
						MinecraftClient.getInstance().options.ao = config.moduleOverworld.smoothLightning;
					}
					if(MinecraftClient.getInstance().options.entityDistanceScaling != ((float)config.moduleOverworld.entityDistance) / 100)
					{
						MinecraftClient.getInstance().options.entityDistanceScaling = ((float)config.moduleOverworld.entityDistance) / 100;
					}
					if(MinecraftClient.getInstance().options.entityShadows != config.moduleOverworld.enableEntityShadows)
					{
						MinecraftClient.getInstance().options.entityShadows = config.moduleOverworld.enableEntityShadows;
					}
				}
				else if(clientWorld.getDimension().hasCeiling())
				{
					if(MinecraftClient.getInstance().options.viewDistance != config.moduleNether.renderDistance)
					{
						MinecraftClient.getInstance().options.viewDistance = config.moduleNether.renderDistance;
					}
					if(MinecraftClient.getInstance().options.gamma != ((float)config.moduleNether.brightness) / 100)
					{
						MinecraftClient.getInstance().options.gamma = ((float)config.moduleNether.brightness) / 100;
					}
					if(MinecraftClient.getInstance().options.particles != config.moduleNether.particles)
					{
						MinecraftClient.getInstance().options.particles = config.moduleNether.particles;
					}
					if(MinecraftClient.getInstance().options.graphicsMode != config.moduleNether.graphics)
					{
						MinecraftClient.getInstance().options.graphicsMode = config.moduleNether.graphics;
					}
					if(MinecraftClient.getInstance().options.ao != config.moduleNether.smoothLightning)
					{
						MinecraftClient.getInstance().options.ao = config.moduleNether.smoothLightning;
					}
					if(MinecraftClient.getInstance().options.entityDistanceScaling != ((float)config.moduleNether.entityDistance) / 100)
					{
						MinecraftClient.getInstance().options.entityDistanceScaling = ((float)config.moduleNether.entityDistance) / 100;
					}
					if(MinecraftClient.getInstance().options.entityShadows != config.moduleNether.enableEntityShadows)
					{
						MinecraftClient.getInstance().options.entityShadows = config.moduleNether.enableEntityShadows;
					}
				}
				else if(clientWorld.getDimension().hasEnderDragonFight())
				{
					if(MinecraftClient.getInstance().options.viewDistance != config.moduleEnd.renderDistance)
					{
						MinecraftClient.getInstance().options.viewDistance = config.moduleEnd.renderDistance;
					}
					if(MinecraftClient.getInstance().options.gamma != ((float)config.moduleEnd.brightness) / 100)
					{
						MinecraftClient.getInstance().options.gamma = ((float)config.moduleEnd.brightness) / 100;
					}
					if(MinecraftClient.getInstance().options.particles != config.moduleEnd.particles)
					{
						MinecraftClient.getInstance().options.particles = config.moduleEnd.particles;
					}
					if(MinecraftClient.getInstance().options.graphicsMode != config.moduleEnd.graphics)
					{
						MinecraftClient.getInstance().options.graphicsMode = config.moduleEnd.graphics;
					}
					if(MinecraftClient.getInstance().options.ao != config.moduleEnd.smoothLightning)
					{
						MinecraftClient.getInstance().options.ao = config.moduleEnd.smoothLightning;
					}
					if(MinecraftClient.getInstance().options.entityDistanceScaling != ((float)config.moduleEnd.entityDistance) / 100)
					{
						MinecraftClient.getInstance().options.entityDistanceScaling = ((float)config.moduleEnd.entityDistance) / 100;
					}
					if(MinecraftClient.getInstance().options.entityShadows != config.moduleEnd.enableEntityShadows)
					{
						MinecraftClient.getInstance().options.entityShadows = config.moduleEnd.enableEntityShadows;
					}
				}
			}
		}));
	}
}
