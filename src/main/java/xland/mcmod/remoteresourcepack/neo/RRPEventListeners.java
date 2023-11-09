package xland.mcmod.remoteresourcepack.neo;

import net.minecraft.server.packs.PackType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import xland.mcmod.remoteresourcepack.RRPCacheRepoSource;
import xland.mcmod.remoteresourcepack.RemoteResourcePack;

@Mod.EventBusSubscriber(modid = RemoteResourcePack.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RRPEventListeners {
    @SubscribeEvent
    public static void addRepoSource(AddPackFindersEvent event) {
        if (event.getPackType() != PackType.CLIENT_RESOURCES) return;
        event.addRepositorySource(new RRPCacheRepoSource(RemoteResourcePack.getCacheFiles()));
//        RemoteResourcePack.insertEnabledPacks(Minecraft.getInstance().getResourcePackRepository());
    }
}
