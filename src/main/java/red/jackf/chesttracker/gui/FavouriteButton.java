package red.jackf.chesttracker.gui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.TexturedButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import static red.jackf.chesttracker.ChestTracker.id;

public class FavouriteButton extends TexturedButtonWidget {
    private static final Identifier TEXTURE = id("textures/favourite_button.png");
    private final HandledScreen<?> screen;

    public FavouriteButton(HandledScreen<?> screen) {
        super(0, 0, 9, 9, 0, 0, 9, TEXTURE, 18, 18, (button) -> {

        });
        this.screen = screen;
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.resize();
        super.render(matrices, mouseX, mouseY, delta);
    }

    private void resize() {
        this.setPos(ButtonPositions.getX(screen, 1), ButtonPositions.getY(screen, 1));
    }
}
