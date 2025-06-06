package com.glektarssza.gradle.conventions;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import org.jetbrains.annotations.NotNull;

/**
 * The main Gradle plugin.
 */
public class GradlePlugin implements Plugin<Project> {
    /**
     * Create a new instance.
     */
    public GradlePlugin() {
        // -- Does nothing.
    }

    /**
     * Apply the conventions to the given {@link Project} object.
     *
     * @param target The target object to apply the conventions to.
     */
    @Override
    public void apply(final @NotNull Project target) {
        // TODO: Implement
    }
}
