package com.drmangotea.tfmg.blocks.engines.small.lpg;


import com.drmangotea.tfmg.blocks.engines.small.EngineBlock;
import com.drmangotea.tfmg.registry.TFMGBlockEntities;
import com.simibubi.create.foundation.block.IBE;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class LPGEngineBlock extends EngineBlock implements IBE<LPGEngineTileEntity> {
    public LPGEngineBlock(Properties properties) {
        super(properties);

    }
    @Override
    public Class<LPGEngineTileEntity> getBlockEntityClass() {
        return LPGEngineTileEntity.class;
    }

    @Override
    public BlockEntityType<LPGEngineTileEntity> getBlockEntityType() {
        return TFMGBlockEntities.LPG_ENGINE.get();
    }
}
