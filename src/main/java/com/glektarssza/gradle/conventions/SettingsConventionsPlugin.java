package com.glektarssza.gradle.conventions;

import org.gradle.api.Plugin;
import org.gradle.api.initialization.Settings;

import org.jetbrains.annotations.NotNull;

/**
 * The main Gradle settings plugin.
 */
public class SettingsConventionsPlugin implements Plugin<Settings> {
    /**
     * Create a new instance.
     */
    public SettingsConventionsPlugin() {
        // -- Does nothing.
    }

    /**
     * Apply the conventions to the given {@link Settings} object.
     *
     * @param target The target object to apply the conventions to.
     */
    @Override
    public void apply(final @NotNull Settings target) {
        // TODO: Implement
    }
}
