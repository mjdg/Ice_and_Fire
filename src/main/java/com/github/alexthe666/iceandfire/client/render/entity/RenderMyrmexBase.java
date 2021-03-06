package com.github.alexthe666.iceandfire.client.render.entity;

import com.github.alexthe666.iceandfire.client.model.ModelGorgon;
import com.github.alexthe666.iceandfire.client.render.entity.layer.LayerGorgonEyes;
import com.github.alexthe666.iceandfire.entity.EntityGorgon;
import com.github.alexthe666.iceandfire.entity.EntityMyrmexBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderMyrmexBase extends RenderLiving<EntityMyrmexBase> {

	public RenderMyrmexBase(RenderManager renderManager, ModelBase model, float shadowSize) {
		super(renderManager, model, shadowSize);
	}

	@Override
	public void preRenderCallback(EntityMyrmexBase myrmex, float partialTickTime) {
		float scale = myrmex.getModelScale();
		if(myrmex.getGrowthStage() == 0){
			scale /= 2;
		}
		if(myrmex.getGrowthStage() == 1){
			scale /= 1.5F;
		}
		GL11.glScalef(scale, scale, scale);

	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMyrmexBase myrmex) {
		return myrmex.getTexture();
	}

}
