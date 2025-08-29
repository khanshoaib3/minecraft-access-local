package org.mcaccess.minecraftaccess.addon.statuses;

import org.jetbrains.annotations.NotNull;

import org.mcaccess.minecraftaccess.api.Status;
import org.mcaccess.minecraftaccess.utils.HypixelSkyblockUtils;

public class HypixelSkyblockStats implements Status {
    @Override
    public @NotNull String message() {
        return HypixelSkyblockUtils.lastStats;
    }

    @Override
    public @NotNull Visibility visibility() {
        if (!HypixelSkyblockUtils.isInServer()) return Visibility.NONE;
        if (HypixelSkyblockUtils.lastStats.isBlank()) return Visibility.NONE;

        return Visibility.NORMAL;
    }
}
