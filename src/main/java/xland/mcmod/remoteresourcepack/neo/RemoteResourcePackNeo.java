package xland.mcmod.remoteresourcepack.neo;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import xland.mcmod.remoteresourcepack.RemoteResourcePack;

@Mod(RemoteResourcePack.MOD_ID)
public class RemoteResourcePackNeo {
    public RemoteResourcePackNeo(Dist dist) {
        if (!dist.isClient())
            throw new IllegalStateException("Mod " + RemoteResourcePack.MOD_ID + " is client-only!");
        RemoteResourcePack.init();
    }
}