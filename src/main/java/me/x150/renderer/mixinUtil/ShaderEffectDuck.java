package me.x150.renderer.mixinUtil;

import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.PostEffectPass;

import java.util.List;

public interface ShaderEffectDuck {
    void addFakeTarget(String name, Framebuffer buffer);

    List<PostEffectPass> getPasses();
}
