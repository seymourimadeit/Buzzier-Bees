package com.minecraftabnormals.buzzier_bees.common.entities;

import com.minecraftabnormals.buzzier_bees.core.registry.BBEntities;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class GrizzlyBearEntity extends AbstractBearEntity {
   public GrizzlyBearEntity(EntityType<? extends GrizzlyBearEntity> type, World worldIn) {
      super(type, worldIn);
   }

   public AgeableEntity createChild(AgeableEntity ageable) {
      return BBEntities.GRIZZLY_BEAR.get().create(this.world);
   }
}
