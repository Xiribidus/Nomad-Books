package ladysnake.nomadbooks.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.MushroomBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class GreenMushroomBlock extends MushroomBlock {
    public GreenMushroomBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isTranslucent(BlockState state, BlockView view, BlockPos pos) {
        return true;
    }
}
